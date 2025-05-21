package test;

import com.mycompany.mavenproject1.Carrito;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CarritoTest {

    @Test
    public void testAñadirProducto() {
        Carrito c = new Carrito("user123");
        boolean resultado = c.añadirProducto("prod01", 10.5);
        assertTrue(resultado);
    }
}
