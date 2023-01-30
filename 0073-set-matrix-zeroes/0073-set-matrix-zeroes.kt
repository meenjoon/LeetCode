class Solution {
    fun setZeroes(matrix: Array<IntArray>): Unit {

        val copyMatrix = matrix.map { it.copyOf() }

        val m = matrix.size //열의 개수(세로 길이)
        val n = matrix[0].size //행의 개수(가로 길이)

        for(i in 0 until m) {
            for(j in 0 until n) {
                if(copyMatrix[i][j]==0) {
                    for (k in 0 until m) {
                        matrix[k][j] = 0
                    }
                    for(k in 0 until n) {
                        matrix[i][k] = 0
                    }
                }
            }
        }
//        matrix.forEach { it.forEach { print(it) } }
    }
}