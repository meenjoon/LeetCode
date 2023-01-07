class Solution {
    fun characterReplacement(s: String, k: Int): Int {

        val map = mutableMapOf<Char,Int>() //String s의 각각의 Char의 수를 구하기 위한 map

        var maxCharCount = 0 //String s의 최대 Char의 수

        var left = 0 //왼쪽 포인터

        var ansMaxLength = 0 //최대 길이

        //윈도우의 크기는 right - left + 1 이다.
        for(right in 0 until s.length) {
            map.put(s[right],map.getOrDefault(s[right],0)+1) //map에 s[right](인덱스)에 해당하는 Char에 Value +1씩
            if(maxCharCount <= map.getValue(s[right])) { //만약 최대 Char의 수가 map의 현재 s[right]에 해당하는 key 값의 Value보다 클 경우
                maxCharCount = map.getValue(s[right])
            }

            if(right-left+1-maxCharCount > k) { //윈도우의 크기 - 최대 Char개수 ==> 바꿔야하는 개수 > k(바꿀 수 있는 횟수)
                map.put(s[left],map.getOrDefault(s[left],0)-1) //map에 s[left]에 해당하는 Char에 Value -1씩
                left++ //윈도우를 오른쪽으로 한 칸 이동하기 위해 left를 +1 씩 해준다.
            }

            if(ansMaxLength <= right-left+1) { //지금까지의 윈도우의 최대 길이보다 현재 윈도우의 크기기가 더 크다면
                ansMaxLength = right-left+1
            }
        }

        return ansMaxLength
    }
}