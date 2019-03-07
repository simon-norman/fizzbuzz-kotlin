package personal.fizzbuzz

import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {
    @Test fun testReturnsNumber() {
        assertEquals(17, FizzBuzz().fizzBuzz())
    }
}