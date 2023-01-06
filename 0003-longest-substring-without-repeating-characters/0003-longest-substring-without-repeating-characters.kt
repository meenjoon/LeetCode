class Solution {
    fun lengthOfLongestSubstring(s : String) : Int {

        var maxLength = 0

        val list = mutableListOf<Char>()

        val countList = mutableListOf<Int>()

        var count = 0

        if(s.length==1 || s == " ") {
            return 1
        }

        for(index in 0 until s.length ) {

            for(index2 in index until s.length) {

                if (!list.contains(s[index2])) {

                    count++ //같은 문자 포함 안 할때 count 개수 +1
                    countList.add(count)

                    list.add(s[index2])

                } else {
                    countList.add(count)
                    list.clear() // 같은 문자를 포함할 때 list 초기화
                    count = 0 // 같은 문자를 포함할 때 0으로 초기화
                    break
                }
            }
        }
//        countList.forEach { print(it) }
        for(index in 0 until countList.size) { //모든 인덱스 위치에서의 count들이 들어가 있는 countList의 최댓값 구하기
            if(maxLength<=countList[index]) {
                maxLength = countList[index]
            }
        }
    
        return maxLength
    }
}