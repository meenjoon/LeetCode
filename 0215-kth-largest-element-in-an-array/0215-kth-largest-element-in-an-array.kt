class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        var result = 0

        nums.sortDescending()

        for((index,value) in nums.withIndex()) {
            if(index == k-1) {
                result = value
            }
        }

        return result

    }
}