public class TransportadoraC implements Transportadora{
    @Override
    public float calcularFrete(float pesoProdutos, float distancia) {
        return (float) ((pesoProdutos * (distancia / 100)) * 19.21);
    }
}
