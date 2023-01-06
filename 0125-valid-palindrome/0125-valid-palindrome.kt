class Solution {
    fun isPalindrome(s: String): Boolean {

        val ansString = s.toLowerCase().filter { it.isLetter() || it.isDigit() }



        println(ansString)

        return ansString == ansString.reversed() || ansString == " "
    }
}