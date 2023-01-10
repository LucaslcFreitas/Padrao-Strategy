import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompraTest {

    @Test
    void deveComprarUtilizandoTransportadoraA() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraA(1000, 3.5f, 50);
        assertEquals(1031.36f, compra.getValorTotal(), 0.01);
    }

    @Test
    void deveComprarUtilizandoTransportadoraB() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraB(1000, 3.5f, 50);
        assertEquals(1028.94f, compra.getValorTotal(), 0.01);
    }

    @Test
    void deveComprarUtilizandoTransportadoraC() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraC(1000, 3.5f, 50);
        assertEquals(1033.61f, compra.getValorTotal(), 0.01);
    }

    @Test
    void deveComprarUtilizandoTransportadoraD() {
        Compra compra = new Compra();
        compra.comprarComTransportadoraD(1000, 3.5f, 50);
        assertEquals(1035.01f, compra.getValorTotal(), 0.01);
    }
}