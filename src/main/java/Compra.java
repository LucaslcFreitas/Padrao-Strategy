public class Compra {

    private float valorTotal;

    public float getValorTotal() {
        return valorTotal;
    }

    public void comprarComTransportadoraA(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraA());
    }

    public void comprarComTransportadoraB(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraB());
    }

    public void comprarComTransportadoraC(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraC());
    }

    public void comprarComTransportadoraD(float valor, float pesoProdutos, float distancia) {
        Pedido pedido = new Pedido(valor, pesoProdutos, distancia);
        this.valorTotal = pedido.calcularValorTotal(new TransportadoraD());
    }
}
