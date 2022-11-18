package ponto.farm.api.pessoa;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "pessoas")
@Entity(name = "Pessoa")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_pessoa")
    private Long id;

    private String cpf;
    private String nome;
    private String email;
    private String nascimento;
    private String foto;
    private String data_admissao;
    private String data_demissao;

    public Pessoa(DadosCadastroPessoa dados){
        this.cpf = dados.cpf();
        this.nome = dados.nome();
        this.email = dados.email();
        this.nascimento = dados.nascimento();
        this.foto = dados.foto();
        this.data_admissao = dados.data_admissao();
        this.data_demissao = dados.data_demissao();
    }

    public void atualizarInformacoes(DadosAtualizacaoPessoa dados) {
        if(dados.cpf() != null) this.cpf = dados.cpf();
        if(dados.nome() != null) this.nome = dados.nome();
        if(dados.email() != null) this.email = dados.email();
        if(dados.nascimento() != null) this.nascimento = dados.nascimento();
        if(dados.foto() != null) this.foto = dados.foto();
        if(dados.data_admissao() != null) this.data_admissao = dados.data_admissao();
        if(data_demissao != null) this.data_demissao = dados.data_demissao();
    }
}
