class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val list = mutableListOf<Int>()

        val sMap = mutableMapOf<Char,Int>() // s String에 대한 각각의 Char을 Map에 넣기 위해 sMap 생성

        val pMap = mutableMapOf<Char,Int>() // p String에 대한 각각의 Char을 Map에 넣기 위해 sMap 생성

        for(index in 0 until p.length) { // p String에 대한 각각의 Char을 Map에 넣기 위한 for문
            pMap.put(p[index],pMap.getOrDefault(p[index],0) + 1) // 만약 중복해서 들어간다면 그 중복된 값에 +1 한다.
        }

        for(index in 0 until s.length) { // s String에 대해 for문 돌리기

            if(index <= s.length-p.length) { // s String의 길이 - p String의 길이 까지만 반복하기 위한 if문 (null 인덱스 오류 방지)
                for(index2 in index until  p.length+index) { // index에서 p String의 길이만큼 반복한다.
                    sMap.put(s[index2], sMap.getOrDefault(s[index2], 0) + 1) // s String에 대한 각각의 Char을 Map에 넣기 위한 것, 만약 중복해서 들어간다면 그 중복된 값에 +1 한다.
                }
            }
//            println("$index : index mapSize : ${sMap.size}")

            if(pMap == sMap) { // 만약 자른 sMap과 pMap이 동일하다면
                list.add(index) // list에 현재 index 추가
            }
            sMap.clear() //다음 인덱스의 sMap을 위해 sMap을 비운다.

        }

        list.forEach { print(it) }

        return list
    }
} 