class Solution {
    fun kthSmallest(matrix: Array<IntArray>, k: Int): Int {

        var result = -1

        val numList = ArrayList<Int>()

        matrix.forEach { it.forEach { numList.add(it) } }

        numList.sort()

        for((index,value) in numList.withIndex()) {
            if(index == k-1) {
                result = value
            }
        }

        return result
    }
}