import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import ExerciciosForWhile.countXO
import ExerciciosForWhile.abc
import org.junit.jupiter.api.Assumptions
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.fail
import kotlin.test.assertTrue

class CountXOTest {

    @Test
    @DisplayName("Testa a quantidade de x e o.")
    fun textCountXO() { //Assertions = assegurar

        Assertions.assertTrue(countXO("xxoo")) //assert true
        Assertions.assertFalse(countXO("xxxoo"))
        Assertions.assertTrue(countXO("xxxoo")) // Expected :true , mas foi falsa


        Assertions.assertAll( // 3 blocos de codigos para testar
            { Assertions.assertTrue(countXO("xxoo")) },
            { Assertions.assertFalse(countXO("xxxoo")) },
            { Assertions.assertFalse(countXO("xxxoo")) }
        )
    }

    @Test
    @Disabled //Desativar classe
    fun naoImplementada() {

    }

    @Test
    fun vaiFalhar() { //Pode falhar / para poder testar depois
        fail("Ainda não implementado")
    }

    @Test
    fun rodaBaseadoEmCondicao() {
        //Assume que vai ser verdade
        Assumptions.assumeFalse(countXO("xxxoo"))

        Assertions.assertEquals(true,countXO("xxxxooO")) //Se for igual o teste passa
    }

    @Test
    fun lancaExcecao() {
        assertThrows<IndexOutOfBoundsException> {
           abc()
        }
    }

    @Test
    fun testNotNull() {
        Assertions.assertNotNull(countXO("fafasss")) //Garantir que e nao e nulo
    }
}