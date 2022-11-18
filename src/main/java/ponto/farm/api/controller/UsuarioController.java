package ponto.farm.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;
import ponto.farm.api.usuario.*;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroUsuario dados) {
        repository.save(new Usuario(dados));
    }

    @GetMapping
    public Page<DadosListagemUsuario> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemUsuario::new);
    }
    
    @GetMapping("/{id}")
    public Optional<Usuario> listarPorId(@PathVariable Long id){
        return repository.findById(id);
    }


    @PutMapping
    @Transactional
    public void atualizar(@RequestBody  DadosAtualizacaoUsuario dados){
        var usuario = repository.getReferenceById(dados.id());
        usuario.atualizarInformacoes(dados);
    }


    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var usuario = repository.getReferenceById(id);
        usuario.exlcuir();
    }



}
