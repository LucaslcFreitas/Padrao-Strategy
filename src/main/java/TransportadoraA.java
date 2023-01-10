public class TransportadoraA implements Transportadora{
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * (distancia / 100)) * 17.92);
    }
}
