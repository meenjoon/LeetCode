class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {

        val copyMatrix = matrix.map { it.copyOf() }

        for(i in 0 until matrix.size) {

            var j = 0

            for(i_rotate in matrix.size-1 downTo  0) {

//                println("[index][a]:[$index][$a] ${matrix[index][a]} / [index2][index]:[$index2][$index] ${copyMatrix[index2][index]}")
                matrix[i][j] = copyMatrix[i_rotate][i]
                j++
            }
//            println()
        }
//        matrix.forEach { it.forEach { print(it) } }

    }
}