import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*


internal class OperacoesTest {

   private val operacaoTest = Operacoes()

    @Test
    fun somaTest() {
        assertEquals(10, operacaoTest.soma(5, 5))
    }

    @Test
    fun subtTest() {
        assertEquals(10, operacaoTest.subt(20, 10))
    }

    @Test
    fun multTest() {
        assertEquals(10, operacaoTest.mult(2, 5))
    }

    @Test
    fun divsTest() {
        assertEquals(10, operacaoTest.divs(20, 2))
    }
}