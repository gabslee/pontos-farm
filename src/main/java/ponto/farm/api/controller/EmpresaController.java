package ponto.farm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ponto.farm.api.empresa.*;
import ponto.farm.api.usuario.Usuario;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("empresas")
public class EmpresaController {

    @Autowired
    private EmpresaRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroEmpresa dados)  {
        repository.save(new Empresa(dados));
    }


    @GetMapping
    public Page<DadosListagemEmpresa> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemEmpresa::new);
    }

    @GetMapping("/{id}")
    public Optional<Empresa> listarPorId(@PathVariable Long id){
        return repository.findById(id);
    }


    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoEmpresa dados){
        var empresa = repository.getReferenceById(dados.id());
        empresa.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }

}
