class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {
        val resultList = mutableListOf<MutableList<Int>>()
        val numList = ArrayList<Int>()

        nums.sort()

        fun dfs(start: Int) {

            if(numList.size == nums.size) {
                resultList.add(numList.toMutableList())
                return
            }

            resultList.add(numList.toMutableList())

            for(index in start until nums.size) {
                numList.add(nums[index])
                dfs(index+1)
                numList.removeAt(numList.size-1)

            }

        }
        dfs(0)

        // resultList.toMutableSet().forEach { print(it) }

        return resultList.toMutableSet().toList()
    }
}