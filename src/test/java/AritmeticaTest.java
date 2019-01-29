import aritmetica.Aritmetica;
import org.junit.Test;

import static org.junit.Assert.*;

public class AritmeticaTest {
    @Test
    public void sumaTest() { //lista de args debe estar vacía
        //fail("Esta prueba debe fallar");
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(2, aritmetica.suma(1,1),0);
    }

    @Test
    public void restaTest() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(0, aritmetica.resta(1,1),1);
    }

    @Test
    public void multiplicaciónTest() {
        Aritmetica aritmetica = new Aritmetica();
        assertEquals(6,aritmetica.multiplicacion(2,3),0);
    }

    @Test
    public void divisiónTest() {

    }
}
