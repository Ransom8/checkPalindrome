package com.example.checkpalindrome

fun main(args: Array<String>) {
    checkPalindrome("madam")
}

/*  Below is the checkPalindrome function to check if a word or string of words
    reads the same when reversed.
 */

fun checkPalindrome(input: String): Boolean {

//  This method converts the input to lower case and closes up all spaces.

    var input = input.toLowerCase().replace(" ", "")
    var output = ""

/*  The if statement below return false when the input string is blank and contains only
    non-alphabet values, it returns true when the input is a palindrome with only alphabets.
    The for loop traverses through the input string and saves it in reverse as "output".
*/

    return if (input.isBlank()) {
        false
    } else if (!input.matches("^[a-z]*$".toRegex())) {
        false
    } else {
        for (i in input.lastIndex downTo 0) {
            output += input[i]
        }
        output == input
    }
}