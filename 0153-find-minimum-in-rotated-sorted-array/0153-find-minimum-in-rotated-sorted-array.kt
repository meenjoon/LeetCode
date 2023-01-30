class Solution {
    fun findMin(nums: IntArray): Int {
        var result = 0

        nums.sort()

        result = nums[0]

        return result
    }
}