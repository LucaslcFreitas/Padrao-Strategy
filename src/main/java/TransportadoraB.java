public class TransportadoraB implements Transportadora{
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * (distancia / 100)) * 16.54);
    }
}
