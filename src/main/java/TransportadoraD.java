public class TransportadoraD implements Transportadora{
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * (distancia / 100)) * 20.01);
    }
}
