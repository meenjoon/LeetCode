class Solution {
    fun search(nums: IntArray, target: Int): Int {

        val map = mutableMapOf<Int, Int>()

        var ans = 0

        for((index,value) in nums.withIndex()) {
            map.put(value,index)
        }

        println(map)

        if(map.containsKey(target)) {
            ans = map.get(target)!!
        }
        else {
            ans = -1
        }
        println(ans)

        return ans
    }
}