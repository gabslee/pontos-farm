package ponto.farm.api.empresa;

import lombok.*;
import org.springframework.stereotype.Service;
import ponto.farm.api.pessoa.Pessoa;

import javax.persistence.*;

@Table(name = "empresas")
@Entity(name = "Empresa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Service
@EqualsAndHashCode(of = "id")
public class Empresa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_empresa")
    private Long id;
    private String cnpj;
    private String nome_empresa;
    private String telefone;
    private String email;


    public Empresa(DadosCadastroEmpresa dados){
        this.cnpj = dados.cnpj();
        this.nome_empresa = dados.nome_empresa();
        this.telefone = dados.telefone();
        this.email = dados.email();
    }


    public void atualizarInformacoes(DadosAtualizacaoEmpresa dados) {
        if(dados.cnpj() != null) this.cnpj = dados.cnpj();
        if(dados.nome_empresa() != null) this.nome_empresa = dados.nome_empresa();
        if(dados.telefone()!= null) this.telefone = dados.telefone();
        if(dados.email() !=null) this.email = dados.email();

    }
}
