package eu.stolin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test


//proc se to dela static?
//vzdyt junit pusti kazdou test metodu v samostatne vytvorene tride
//test metody jsou pa k lepe oddelene - proto before all potrebuje static - jinak by to neslo

//v kotlinu statiku statiku nemame, ale muzeme ji emulovat
class JUnit_03_JvmStaticCompanionBeforeAll {

    companion object {
        lateinit var classUnderTest: ClassUnderTest

        @JvmStatic
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