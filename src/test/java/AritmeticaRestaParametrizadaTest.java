import aritmetica.Aritmetica;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(Parameterized.class)
public class AritmeticaRestaParametrizadaTest {
    private static Aritmetica aritmetica;
    private float minuendo;
    private float sustraendo;
    private float resultado;

    public AritmeticaRestaParametrizadaTest(float minuendo, float sustraendo,
                                            float resultado) {
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
        this.resultado = resultado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> parametros() {
        return Arrays.asList(new Object[][]{
                {1, 1, 0},
                {2, 1, 1},
                {1, 2, -1},
                {-2, 2, -4},
                {-2, -2, 0},
                {1001, 1, 1000}
        });
    }

    @BeforeClass
    public static void setUp() {
        aritmetica = new Aritmetica();
    }

    @Test
    public void restasTest() {
        assertThat(aritmetica.resta(minuendo, sustraendo), is(resultado));
    }
}