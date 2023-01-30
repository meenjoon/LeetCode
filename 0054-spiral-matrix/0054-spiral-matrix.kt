class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {

        val resultList = mutableListOf<Int>()

        var width_start = 0
        var width_end = matrix[0].size - 1

        var length_start = 0
        var length_end = matrix.size - 1

        while (width_start <= width_end && length_start <= length_end) {

            for(index in width_start..width_end) { //윗쪽 변
                println("11 $length_start $index")
                resultList.add(matrix[length_start][index])
            }
            length_start++

            for(index in length_start..length_end) { //오른쪽 변
                println("22 $index $width_end")
                resultList.add(matrix[index][width_end])
            }
            width_end--

            if(length_start <= length_end) { // 아래쪽 변
                for(index in width_end downTo width_start) {
                    println("33 $length_end $index")
                    resultList.add(matrix[length_end][index])
                }
                length_end--
            }

            if(width_start<=width_end) { //왼쪽 변
                for(index in length_end downTo length_start) {
                    println("44 $index $width_start")
                    resultList.add(matrix[index][width_start])
                }
                width_start++
            }

        }

        // resultList.forEach { print(it) }

        return resultList
    }
}