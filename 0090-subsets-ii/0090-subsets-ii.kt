class Solution {
    fun subsetsWithDup(nums: IntArray): List<List<Int>> {

        nums.sort()
        
        val resultList = mutableListOf<MutableList<Int>>()

        val numList = ArrayList<Int>()

        fun dfs(start: Int){

//            println(numList)
            resultList.add(numList.toMutableList())

            for (index in start until nums.size) {
                numList.add(nums[index])
                dfs(index+1)
                numList.removeAt(numList.size-1)
            }
        }

        dfs(0)

//        resultList.toMutableSet().toList().forEach { println(it) }

        return resultList.toMutableSet().toList()
    }
}