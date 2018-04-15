package eu.stolin

import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test

class JUnit_01_NotWorkingBeforeAll {

    lateinit var classUnderTest: ClassUnderTest

    @BeforeAll
    fun init() {
        classUnderTest = ClassUnderTest()
    }

    @Test fun test1() { }

    @Test fun test2() { }

    @Test fun test3() { }
}