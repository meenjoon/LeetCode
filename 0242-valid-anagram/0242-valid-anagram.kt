class Solution {
    fun isAnagram(s: String, t: String): Boolean {

        val sList = s.toMutableList()
        sList.sort()
        val sString = sList.toString()

        val tList = t.toMutableList()
        tList.sort()
        val tString = tList.toString()

        if (sString==tString) {
            return true
        }

        else {
            return false
        }

    }
}