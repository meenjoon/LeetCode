class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        val ansIntArray = IntArray(nums.size)

        var n = 1

        for(index in 0 until nums.size) {
            ansIntArray[index] = n
            n *= nums[index] // n = n * nums[index]
        }

        n = 1

        for(index in nums.size-1 downTo 0) {
            ansIntArray[index] = n * ansIntArray[index]
            n *= nums[index] // n = n * nums[index]
        }

        ansIntArray.forEach { print(it) }

        return ansIntArray
    }
}