class Solution {
    fun maxSubArray(nums: IntArray): Int {

        var sum = 0

        var max = Int.MIN_VALUE


        for(index in 0 until nums.size) {
            sum = sum + nums[index]

            if(sum<nums[index]) {
                sum = nums[index]
            }

            if(max<=sum) {
                max = sum
            }
            
        }

        println(max)


        return max
    }
}