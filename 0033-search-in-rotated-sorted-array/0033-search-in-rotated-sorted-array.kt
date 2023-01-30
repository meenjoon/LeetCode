class Solution {
    fun search(nums: IntArray, target: Int): Int {

        var result = -1

        for((index,value) in nums.withIndex()){
            if(value == target) {
                result = index
                return result
            }
        }
        return result
    }
}