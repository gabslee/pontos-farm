package ponto.farm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ponto.farm.api.ponto.*;
import ponto.farm.api.usuario.Usuario;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pontos")
@CrossOrigin(origins = "*")
public class PontoController {

    @Autowired
    private PontoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroPonto dados){
        repository.save(new Ponto(dados));
    }

    @GetMapping
    public Page<DadosListagemPonto> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPonto::new);
    }

    @GetMapping("/{id}")
    public Optional<Ponto> listarPorId(@PathVariable Long id){
        return repository.findById(id);
    }


    @PutMapping
    @Transactional
    public void atualizar(@RequestBody DadosAtualizacaoPonto dados) {
        var ponto = repository.getReferenceById(dados.id());
        ponto.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

}
