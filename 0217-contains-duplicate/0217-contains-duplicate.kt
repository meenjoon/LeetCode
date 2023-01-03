class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {

        var ansBool = false

        val map = mutableMapOf<Int, Int>()

        nums.forEach { map.put(it,map.getOrDefault(it,0) +1 ) }

        if (map.filterValues { it>1 }.isNotEmpty() ) {
            ansBool = true
        }
        else {
            ansBool = false
        }

//        println(map)
//        println(ansBool)


        return ansBool
    }
}