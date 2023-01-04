class Solution {
    fun sortColors(nums: IntArray): Unit { // 작은 수로 정렬

        for(index in 0 until nums.size) {
            for (index2 in index until nums.size) {
                if (nums[index] > nums[index2]) {
                    var temp = nums[index]
                    nums[index] = nums[index2]
                    nums[index2] = temp
                }
            }
        }
//    nums.forEach { print(it) }

    }
}