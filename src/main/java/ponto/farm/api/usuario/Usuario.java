package ponto.farm.api.usuario;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Table(name = "usuarios")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario")
    private Long id;

    @Enumerated(EnumType.STRING)
    private tipo_usuario tipo_usuario;


    @Enumerated(EnumType.STRING)
    private status status;
    private String login;
    private String email;
    private String senha;




    public Usuario(DadosCadastroUsuario dados) {
        this.tipo_usuario = dados.tipo_usuario();
        this.status = ponto.farm.api.usuario.status.ATIVO;
        this.login = dados.login();
        this.email= dados.email();
        this.senha= dados.senha();
    }


    public void atualizarInformacoes(DadosAtualizacaoUsuario dados){
        if(dados.tipo_usuario()!= null) this.tipo_usuario = dados.tipo_usuario();
        if(dados.login()!= null) this.login = dados.login();
        if(dados.email()!=null) this.email = dados.email();
        if(dados.senha() != null) this.senha = dados.senha();
    }

    public void exlcuir() {
        this.status = ponto.farm.api.usuario.status.INATIVO;
    }
}
