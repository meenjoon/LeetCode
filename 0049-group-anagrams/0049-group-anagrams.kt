class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        
        val map = mutableMapOf<String, MutableList<String>>()
        
        for(index in 0 until strs.size) {

            val sortedString = strs[index].toCharArray().sorted().joinToString("")

            if(map.containsKey(sortedString)) {

                map[sortedString]?.add(strs[index])
            }

            else {
                map.put(sortedString, mutableListOf(strs[index]))
            }
        }

//        println(map)

        return map.values.toList()
    }
}