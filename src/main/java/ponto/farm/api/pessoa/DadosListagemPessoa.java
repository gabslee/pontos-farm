package ponto.farm.api.pessoa;

public record DadosListagemPessoa(
        Long id,
        String cpf,
        String nome,
        String email,
        String nascimento,
        String data_admissao,
        String data_demissao

)  {

    public DadosListagemPessoa (Pessoa pessoa){
        this(pessoa.getId(),pessoa.getCpf(),pessoa.getNome(),pessoa.getEmail(),pessoa.getNascimento(), pessoa.getData_admissao(), pessoa.getData_demissao());
    }


}
