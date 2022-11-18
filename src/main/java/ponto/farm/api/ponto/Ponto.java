package ponto.farm.api.ponto;

import lombok.*;

import javax.persistence.*;

@Table(name = "pontos")
@Entity(name = "Ponto")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ponto {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_ponto")
    private Long id;
    private String entrada1;
    private String saida1;
    private String entrada2;
    private String saida2;
    private String observacao;

    public Ponto(DadosCadastroPonto dados) {
        this.entrada1 = dados.entrada1();
        this.entrada2 = dados.entrada2();
        this.saida1 = dados.saida1();
        this.saida2 = dados.saida2();
        this.observacao = dados.observacao();
    }

    public void atualizarInformacoes(DadosAtualizacaoPonto dados) {
        if(dados.entrada1()!= null) this.entrada1 = dados.entrada1();
        if(dados.saida1() != null) this.saida1 = dados.saida1();
        if(dados.entrada2() != null) this.entrada2 = dados.entrada2();
        if(dados.saida2() != null) this.saida2 = dados.saida2();
    }


}
