class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var result = false

        matrix.forEach { it.forEach { if (it==target) {
            result =true }
            }
        }
        return result
    }
}