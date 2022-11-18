package ponto.farm.api.empresa;

public record DadosListagemEmpresa(

        Long id,
        String cnpj,
        String nome_empresa,
        String telefone,
        String email
) {

    public DadosListagemEmpresa (Empresa empresa){
        this(empresa.getId(), empresa.getCnpj(), empresa.getNome_empresa(), empresa.getTelefone(), empresa.getEmail());
    }


}
