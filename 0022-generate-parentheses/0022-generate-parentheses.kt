class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val list = mutableListOf<String>()

        val build = StringBuilder()

        fun parentheses(left: Int, right: Int) { //left:( right:)
            val len = build.length //현재 StringBuilder의 길이
            println("len : $len left: $left right: $right")

            if( left == n  && right == n) { //(,)의 개수가 n개와 같아지면 종료문
                list.add(build.toString()) // StringBuilder()에 저장된 문자를 문자열로 바꾼후 list에 add해준다.
                println("====len : $len left: $left right: $right")
                return
            }

            if(left<n) { //( 가 n개의 개수보다 적을때
                build.append("(") //StringBuilder에 ( 추가
                println("11 ( len : $len left: $left right: $right")
                parentheses(left+1, right) // (를 한 개 추가해주는재귀함수를 호출한다.
                println("//현재 bulder의 사이즈 : ${build.length} -> len : $len left: $left right: $right ")
                println(build.toString()) //현재의 Stringbuilder에 저장된 문자열 확인용 
                build.setLength(len) // 함수가 되돌아왔을때 현재 Stringbuilder에 저장된 사이즈를 되돌아왔을때의 함수에 저장된 len(Stringbuilder 길이) 만큼 초기화해준다.
                println(build.toString()) //현재의 Stringbuilder에 저장된 문자열을 되돌아온 함수의 len(Stringbuilder 길이)만큼 초기화를 해준것을 확인용
            }
            if(right<left) { //) 가 (의 개수보다 적을때
                build.append(")") //StringBuilder에 ) 추가
                println("22 ) len : $len left: $left right: $right")
                parentheses(left,right+1) // )의 개수를 한 개 추가해주는 재귀함수를 호출한다.
                println("@@현재 bulder의 사이즈 : ${build.length} -> len : $len left: $left right: $right ")
                println(build.toString()) //현재의 Stringbuilder에 저장된 문자열 확인용
                build.setLength(len) // 함수가 되돌아왔을때 현재 Stringbuilder에 저장된 사이즈를 되돌아왔을때의 함수에 저장된 len(Stringbuilder 길이) 만큼 초기화해준다.
                println(build.toString()) //현재의 Stringbuilder에 저장된 문자열을 되돌아온 함수의 len(Stringbuilder 길이)만큼 초기화를 해준것을 확인용
            }
        }
        parentheses(0,0) ////parentheses 함수를 (, )를 0개인 상태로 호출한다.

        list.forEach { println(it) }

        return list
    }
}