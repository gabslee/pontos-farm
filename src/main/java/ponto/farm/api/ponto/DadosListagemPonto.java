package ponto.farm.api.ponto;

public record DadosListagemPonto(
        Long id,
        String entrada1,
        String saida1,
        String entrada2,
        String saida2,
        String observacao
) {

    public DadosListagemPonto(Ponto ponto){
        this(ponto.getId(), ponto.getEntrada1(), ponto.getSaida1(), ponto.getEntrada2(), ponto.getSaida2(), ponto.getObservacao());
    }

}
