class Solution {
    fun generateParenthesis(n: Int): List<String> {

        val resultList = mutableListOf<String>()

        val stringBuilder = StringBuilder()

        fun dfs(left: Int, right: Int) {

            if(stringBuilder.length == n * 2) {
//                println("stringBuilder의 길이 == n * 2 , ${stringBuilder.toString()}")
                resultList.add(stringBuilder.toString())

                return
            }

            if(left<n) {
                stringBuilder.append("(")
//                println("left문, ${stringBuilder.toString()}")
                dfs(left+1, right)
                stringBuilder.deleteCharAt(stringBuilder.length-1)
//                println("left문 빠져나옴,  ${stringBuilder.toString()}")

            }

            if(right<left) {
                stringBuilder.append(")")
//                println("right문, ${stringBuilder.toString()}")
                dfs(left,right+1)
                stringBuilder.deleteCharAt(stringBuilder.length-1)
//                println("right문 빠져나옴,  ${stringBuilder.toString()}")
            }
        }

        dfs(0,0)

        // resultList.forEach { print(it) }

        return resultList
    }
}