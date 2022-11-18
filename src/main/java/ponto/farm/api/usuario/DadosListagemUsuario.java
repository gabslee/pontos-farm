package ponto.farm.api.usuario;

public record DadosListagemUsuario(
        Long id,
        tipo_usuario tipo_usuario,
        String login,
        status status

) {
    public DadosListagemUsuario(Usuario usuario){
        this(usuario.getId(), usuario.getTipo_usuario(), usuario.getLogin(), usuario.getStatus());
    }
}
