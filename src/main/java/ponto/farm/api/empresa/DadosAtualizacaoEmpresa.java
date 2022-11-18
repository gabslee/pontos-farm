package ponto.farm.api.empresa;

import javax.validation.constraints.NotNull;

public record DadosAtualizacaoEmpresa(

        @NotNull
        Long id,
        String cnpj,
        String nome_empresa,
        String telefone,
        String email

) {

}
