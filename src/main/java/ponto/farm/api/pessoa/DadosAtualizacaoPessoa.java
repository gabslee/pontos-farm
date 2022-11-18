package ponto.farm.api.pessoa;

import javax.validation.constraints.NotNull;

public record DadosAtualizacaoPessoa(

        Long id,
        String cpf,

        String nome,

        String email,

        String nascimento,
        String foto,

        String data_admissao,
        String data_demissao



) {
}
