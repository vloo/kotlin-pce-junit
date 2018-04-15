package eu.stolin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class JUnit_02_NotWorkingCompanionBeforeAll {


    companion object {
        lateinit var classUnderTest: ClassUnderTest

        @BeforeAll
        fun init() {
            classUnderTest = ClassUnderTest()
        }
    }


    @Test
    fun testMethod1() {
        Assertions.assertNotNull(classUnderTest)
    }

    @Test
    fun testMethod2() {
        Assertions.assertNotNull(classUnderTest)
    }

    @Test
    fun testMethod3() {
        Assertions.assertNotNull(classUnderTest)
    }
}