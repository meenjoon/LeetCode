class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {

        val map = mutableMapOf<Char, Int>()

        for(index in 0 until magazine.length) {
            map.put(magazine[index], map.getOrDefault(magazine[index], 0) + 1)
        }

        for(index in 0 until ransomNote.length) {
            map.put(ransomNote[index], map.getOrDefault(ransomNote[index],0) -1 )

            if (map[ransomNote[index]]!! < 0) {
                return false
            }

        }
        return true
    }
}