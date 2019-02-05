import aritmetica.Aritmetica;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AritmeticaTest {
    private Aritmetica aritmetica;

    //BeforeClass > Before > After > AfterClass
    @Before  //antes de cualquier test
    public void inicio() {
        System.out.println("Método inicial");
        aritmetica = new Aritmetica();
    }

    @After  //para destruir lo que hay antes
    public void finish() {
        aritmetica = null;
    }

    @Test
    public void sumaTest() { //lista de args debe estar vacía
        //fail("Esta prueba debe fallar");
        System.out.println("Método sumaTest");
        assertEquals(2, aritmetica.suma(1,1),0);
    }

    @Test
    public void restaTest() {
        System.out.println("Método restaTest");
        assertEquals(0, aritmetica.resta(1,1),1);
    }

    @Test
    public void multiplicaciónTest() {
        System.out.println("Método multiplicaciónTest");
        assertEquals(6,aritmetica.multiplicacion(2,3),0);
    }

    @Test
    public void divisiónTest() {
        System.out.println("Método divisiónTest");
        assertEquals(5, aritmetica.division(10,2),0);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionPorCero() {
        try {
            System.out.println(1 / 0);
            fail("Aquí no debe llegar");
        } catch (ArithmeticException e){

        }
    }

}
