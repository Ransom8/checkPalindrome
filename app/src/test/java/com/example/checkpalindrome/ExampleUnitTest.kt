package com.example.checkpalindrome

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun check_short_word() {
        assertEquals(checkPalindrome("madam"), true)
    }
    @Test
    fun check_blank() {
        assertEquals(checkPalindrome(""), true)
    }
    @Test
    fun check_space() {
        assertEquals(checkPalindrome("  "), true)
    }
    @Test
    fun check_non_string() {
        assertEquals(checkPalindrome(",2-_"), false)
    }
    @Test
    fun check_sentence() {
        assertEquals(checkPalindrome("Was it a car or a cat I saw"), true)
    }
    @Test
    fun check_non_mixed_types() {
        assertEquals(checkPalindrome("Oh! how are you?"), false)
    }
    @Test
    fun check_non_palindrome() {
        assertEquals(checkPalindrome("wikipedia"), false)
    }
}