class Solution {
    fun subsets(nums: IntArray): List<List<Int>> {

        val resultList = mutableListOf<MutableList<Int>>()

        val numList = ArrayList<Int>()

        fun dfs(start: Int) {

//            println("어떤 값을 추가, ${numList}")
            resultList.add(numList.toMutableList())

            for(index in start until nums.size) {
                numList.add(nums[index])
//                println("바로 추가, ${numList}")
                dfs(index+1)
//                println("빠져나옴, ${numList}")
                numList.removeAt(numList.size-1)
//                println("지운 후, ${numList}")
            }

        }

        dfs(0)

//        resultList.forEach { print(it)  }

        return resultList
    }
}