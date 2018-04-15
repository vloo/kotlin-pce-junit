package eu.stolin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

//na druhou stranu proc tu statiku emulovat kdyz ji nepotrebujem
//dalsi mozne reseni je nevytvaret testouvou instaci pro kazdou testovou metodu extra
//ale vytvorit jen jednu, pak nepotrebujeme staticke metody
//tohle reseni se mi libi trochu vic

//da se to resit i globalne

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class JUnit_04_TestInstanceBeforeAll {

    lateinit var classUnderTest: ClassUnderTest

    @BeforeAll
    fun init() {
        classUnderTest = ClassUnderTest()
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