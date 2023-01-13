class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        val list = mutableListOf<Int>()

        for(index in 0 until nums.size) {
            for(index2 in index until nums.size) {

                if(index != index2 && nums[index] + nums[index2] == target) {
                    list.add(index)
                    list.add(index2)
                }
            }
        }
    //    
    //    list.forEach { print(it) }


        return list.toIntArray()
    }
}