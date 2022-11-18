package ponto.farm.api.empresa;

public record DadosCadastroEmpresa(
        String cnpj,
        String nome_empresa,
        String telefone,
        String email
) {
}
