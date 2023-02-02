class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {

        val rowBooleanArray = Array(9){ BooleanArray(10) }
        val columnBooleanArray = Array(9) { BooleanArray(10) }
        val miniBox = Array(9) { BooleanArray(10) }


        for((i,i_value) in board.withIndex()) {
            for((j,j_value) in board[i].withIndex()) { //[0][0]부터 [8][8] 까지 순서대로 for문 돌리기
                if(j_value != '.') { //각 인덱스 마다 하나하나 검사를 하는데 이때 숫자인 경우에 위에서 만든 (가로, 세로, 미니 박스) 배열에 각 해당하는 인덱스 값과 현재 인덱스의 숫자를 넣어서 중복을 방지한다.
                    val miniBoxIndex = (i/3) * 3 + (j/3) //미니 박스의 인덱스

                    val compare_Int = j_value -'0' // Char -> Int로 변환
//                    println("i:$i j:$j compare_Int:$compare_Int")
                    if(rowBooleanArray[i][compare_Int] || columnBooleanArray[j][compare_Int] //만약 가로,세로 미니박스에 대해 true라고 하면 이미 존재하는 값이기에 스도쿠 유효성에 어긋난다.
                        || miniBox[miniBoxIndex][compare_Int]) {
                        return false
                    }
                    else { //만약 가로 세로 미니박스 배열에 대해서 해당하는 숫자가 모두 false일 경우에는 값이 중복되지 않았기에 각 배열에 대해서 true로 바꿔준다.
                        rowBooleanArray[i][compare_Int] = true
                        columnBooleanArray[j][compare_Int] = true
                        miniBox[miniBoxIndex][compare_Int] = true
                    }
                }
            }
        }

        return true
    }
}