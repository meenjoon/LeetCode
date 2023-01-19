class Solution {
    fun letterCombinations(digits: String): List<String> {
        val ansList = mutableListOf<String>()

        val map = mutableMapOf<Int, MutableList<Char>>()

        val charList = mutableListOf<MutableList<Char>>()

        val stringBuilder = StringBuilder()

        for(index in 2..9) {

            if(index==2 ) {
                map.put(index , mutableListOf('a'))
                map[index]?.add('b')
                map[index]?.add('c')
            }
            if(index==3) {
                map.put(index , mutableListOf('d'))
                map[index]?.add('e')
                map[index]?.add('f')
            }
            if(index==4) {
                map.put(index , mutableListOf('g'))
                map[index]?.add('h')
                map[index]?.add('i')
            }
            if(index==5) {
                map.put(index , mutableListOf('j'))
                map[index]?.add('k')
                map[index]?.add('l')
            }
            if(index==6) {
                map.put(index , mutableListOf('m'))
                map[index]?.add('n')
                map[index]?.add('o')
            }
            if(index==7) {
                map.put(index , mutableListOf('p'))
                map[index]?.add('q')
                map[index]?.add('r')
                map[index]?.add('s')
            }
            if(index==8) {
                map.put(index , mutableListOf('t'))
                map[index]?.add('u')
                map[index]?.add('v')
            }
            if(index==9) {
                map.put(index , mutableListOf('w'))
                map[index]?.add('x')
                map[index]?.add('y')
                map[index]?.add('z')
            }
//            println(map)
    }

    if(digits == "") {
        return ansList
    }


    fun phone(start: Int) {

        if(stringBuilder.length==digits.length) {

//            println(stringBuilder.toString())

            ansList.add(stringBuilder.toString())

            return
        }


        val inputNumberToString = map[digits[start].toString().toInt()].toString().filter { it.isLetter()}

        for(value in inputNumberToString) {
            stringBuilder.append(value)
            phone(start + 1)
            stringBuilder.deleteCharAt(stringBuilder.length-1)
        }

    }

    phone(0)

//    ansList.forEach { print(it) }

//    println(map)

        return ansList
    }
}