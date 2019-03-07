package personal.fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {
    @Test fun testReturnsNumber() {
        assertEquals(17, fizzBuzz(17))
    }

    @Test fun testReturnsFizzOn3() {
        assertEquals("fizz", fizzBuzz(3))
    }

    @Test fun testReturnsBuzzOn5() {
        assertEquals("buzz", fizzBuzz(5))
    }

    @Test fun testReturnsFizzBuzzOnMult3And5() {
        assertEquals("fizzbuzz", fizzBuzz(15))
    }
}