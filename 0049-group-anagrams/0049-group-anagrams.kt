class Solution {
fun groupAnagrams(strs: Array<String>): List<List<String>> {

    val list = mutableListOf<MutableList<String>>()

    val map = mutableMapOf<String,MutableList<String>>()

    for((index, value) in strs.withIndex()) {

        val sorted = value.toCharArray().sorted().joinToString("")

        if(map.containsKey(sorted)) { // 키 값이 이미 존재한다면
            map.getValue(sorted).add(value)
//            map[sorted]!!.add(value) 이것도 가능
        }
        else { // 키 값이 존재하지 않는다면
            map.put(sorted, mutableListOf(value))
        }

    }
    map.forEach { list.add(it.value) } //map에 들어있는 MutableList<String>을 list에 넣는다.
//
//    list.forEach { print(it) }

    return list
}
}