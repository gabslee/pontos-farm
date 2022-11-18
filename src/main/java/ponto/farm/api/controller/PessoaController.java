package ponto.farm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ponto.farm.api.pessoa.*;
import ponto.farm.api.usuario.Usuario;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
    @Autowired
    private PessoaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPessoa dados) {
        repository.save(new Pessoa(dados));
    }

    @GetMapping
    public Page<DadosListagemPessoa> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPessoa::new);
    }

    @GetMapping("/{id}")
    public Optional<Pessoa> listarPorId(@PathVariable Long id){
        return repository.findById(id);
    }


    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoPessoa dados){
        var pessoa = repository.getReferenceById(dados.id());
        pessoa.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
