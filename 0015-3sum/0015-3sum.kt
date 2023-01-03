class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {

        nums.sort()
        val list = mutableListOf<List<Int>>()

        var sum = 0

        var start = 0

        var first = nums[0]
        var third = nums[2]


        for(index in 0 until nums.size-1) {
            var left = index + 1
            var right = nums.size -1

            while (left<right) {
                val sum = nums[index] + nums[left] + nums[right]

                if(sum == 0) {
                    val l = listOf(nums[index] , nums[left] , nums[right])
                    left++
                    right--
                    if(!list.contains(l)) {
                        list.add(l)
                    }

                }
                else if(sum < 0) {
                    left++
                }
                else{
                    right--
                }
            }
        }

        list.forEach { print(it) }


        return list
    }
}