class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {

        val resultList = mutableListOf<MutableList<Int>>()

        val numList = ArrayList<Int>()

        fun dfs(start: Int) {

            if(numList.size == k) {
//                println("//넣는 값, ${numList}")
                resultList.add(numList.toMutableList())
                return
            }

            for(index in start .. n) {
                numList.add(index)
//                println("바로 추가, ${numList}")
                dfs(index+1)
//                println("빠져나옴, ${numList}")
                numList.removeAt(numList.size-1)
//                println("삭제 후, ${numList}")
            }
        }

        dfs(1)

        return resultList
    }
}