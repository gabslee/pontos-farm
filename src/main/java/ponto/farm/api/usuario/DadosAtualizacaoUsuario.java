package ponto.farm.api.usuario;

public record DadosAtualizacaoUsuario(
        Long id,

        tipo_usuario tipo_usuario,
        String login,
        String email,
        String senha

) {
}
