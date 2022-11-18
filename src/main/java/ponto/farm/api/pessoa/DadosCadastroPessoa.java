package ponto.farm.api.pessoa;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DadosCadastroPessoa(


        String cpf,

        String nome,

        String email,

        String nascimento,
        String foto,

        String data_admissao,
        String data_demissao


) {
}
