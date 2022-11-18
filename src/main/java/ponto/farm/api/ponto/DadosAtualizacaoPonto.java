package ponto.farm.api.ponto;

import javax.validation.constraints.NotNull;

public record DadosAtualizacaoPonto(

        @NotNull
        Long id,
        String entrada1,
        String saida1,
        String entrada2,
        String saida2,
        String observacao

) {
}
