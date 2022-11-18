package ponto.farm.api.usuario;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotNull
        tipo_usuario tipo_usuario,
        @NotBlank
        @Email
        String login,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String senha,

        status status
) {
}
