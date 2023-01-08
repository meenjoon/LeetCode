class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val list = mutableListOf<Int>()

        val sMap = mutableMapOf<Char,Int>()

        val pMap = mutableMapOf<Char,Int>()

        for(index in 0 until p.length) {
            pMap.put(p[index],pMap.getOrDefault(p[index],0) + 1)
        }
    
        for(index in 0 until s.length) {

            if(index <= s.length-p.length) {
                for(index2 in index until  p.length+index) {
                    sMap.put(s[index2], sMap.getOrDefault(s[index2], 0) + 1)
                }
            }
//            println("$index : index mapSize : ${sMap.size}")
            
            if(pMap == sMap) {
                list.add(index)
            }
            sMap.clear()

        }

        list.forEach { print(it) }
    
        return list
    }
} 