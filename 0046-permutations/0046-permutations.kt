class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val resultList = mutableListOf<MutableList<Int>>()
        val numList = ArrayList<Int>()

        fun dfs(start: Int){
            if(numList.size == nums.size) {
                // println("//추가한 값, ${numList} start: $start")
                resultList.add(numList.toMutableList())
                return
            }

            for(index in 0 until nums.size) {
                if(!numList.contains(nums[index])) {
                    numList.add(nums[index])
                    // println("바로 추가, $numList start: $start index: $index, value: ${nums[index]}")

                    dfs(index + 1)
                    // println("빠져나옴, $numList start: $start index: $index, value: ${nums[index]}")

                    numList.removeAt(numList.size-1)
                    // println("마지막 값 삭제, $numList")
                }

            }
           
            /*
            아래의 방법도 가능하다.
             */
            
//            for((index,value) in nums.withIndex()) {
//                println("그냥 for문 무조건 실행, ${numList} start: $start index: $index, value: $value")
//
//                if(!numList.contains(value)) {
//
//                    numList.add(value)
//                    println("바로 추가, ${numList} start: $start index: $index, value: $value")
//
//                    dfs(index + 1)
//                    println("빠져나옴, ${numList} start: $start index: $index, value: $value")
//
//                    numList.removeAt(numList.size-1)
//                    println("마지막 값 삭제, ${numList}")
//                }
//            }
        }

        dfs(0)

        return resultList
    }
}