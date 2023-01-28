class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val resultList = mutableListOf<MutableList<Int>>()
        val numList = ArrayList<Int>()

        fun dfs(start: Int){
            if(numList.size == nums.size) {
                // println("//추가한 값, ${numList}")
                resultList.add(numList.toMutableList())
                return
            }

            for((index,value) in nums.withIndex()) {
                if(!numList.contains(value)) {

                    numList.add(value)
                    // println("바로 추가, ${numList}")

                    dfs(index + 1)
                    // println("빠져나옴, ${numList}")

                    numList.removeAt(numList.size-1)
                    // println("마지막 값 삭제, ${numList}")
                }
            }
        }

        dfs(0)

        return resultList
    }
}