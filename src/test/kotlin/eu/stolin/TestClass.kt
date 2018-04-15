package eu.stolin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class TestClass {

    @Test
    fun oldSkoolAssertThrows() {
        val exception = Assertions.assertThrows (IllegalArgumentException::class.java, {
            throw IllegalArgumentException("a message")
        })
        Assertions.assertEquals("a message", exception.message)
    }


    @Test
    fun `exception testing`() {
        val exception = assertThrows<IllegalArgumentException> {
            throw IllegalArgumentException("a message")
        }
        Assertions.assertEquals("a message", exception.message)
    }
}

