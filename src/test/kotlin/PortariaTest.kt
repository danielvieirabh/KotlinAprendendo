import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import ExercicioEtapa3.portariaEvento
import ExerciciosForWhile.countXO
import org.junit.jupiter.api.Assumptions

class PortariaTest {
    //Fazer ela 100% Covered (Testada)

    private val acessoPermitido = "Acesso permitido seu bucetudo"
    private val acessoNegadoConvite = "Negado. COnvite Inválido"
    private val menor18 = "Acesso negado. Menores de idade não sao permitidos!"

    @Test
    fun testarPassagemPremium() {
        val resultado = portariaEvento(18, "premium", "XLss")

        Assertions.assertEquals(acessoPermitido, resultado)
    }

    @Test
    fun testarPassagemLuxo() {
        val resultado = portariaEvento(18, "luxo", "XL311")

        Assertions.assertEquals(acessoPermitido, resultado)
    }

    @Test
    fun testarPassagemComum() {
        val resultado = portariaEvento(20, "comum", "XT99")
        Assertions.assertEquals(acessoPermitido, resultado)
    }

    @Test
    fun testarPassagemComumCodigoErrado() {
        val resultado = portariaEvento(20, "comum", "X6222")
        Assertions.assertEquals(acessoNegadoConvite, resultado)
    }

    @Test
    fun negarMenorIdade() {
        val resultado = portariaEvento(16, "premium", "XLsssss")
        Assertions.assertEquals(menor18, resultado)
    }

    @Test
    fun testeConviteLuxo() {
        val resultado = portariaEvento(18, "luxo", "LLsss")
        Assertions.assertEquals(acessoNegadoConvite, resultado)
    }

    @Test
    fun testeConvitePremium() {
        val resultado = portariaEvento(31, "premium", "LLsss")
        Assertions.assertEquals(acessoNegadoConvite, resultado)
    }

    @Test
    fun negarConviteInexistente() {
        val resultado = portariaEvento(25, "vip", "XT123")
        Assertions.assertEquals(acessoNegadoConvite, resultado)
    }

    @Test
    fun testarPassagemComumSemCodigo() {
        val resultado = portariaEvento(20, "comum", "")
        Assertions.assertEquals(acessoNegadoConvite, resultado)
    }


}