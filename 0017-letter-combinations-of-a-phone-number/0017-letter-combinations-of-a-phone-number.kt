class Solution {
    fun letterCombinations(digits: String): List<String> {

        val result = mutableListOf<String>()

        val map = mutableMapOf<Int,String>()

        val phoneNumber_StringBuilder = StringBuilder()
        
        if(digits=="") {
            return result
        }

        for(index in 2..9) {
            if(index==2) {
                map.put(index,"abc")
            }
            if(index==3) {
                map.put(index,"def")
            }
            if(index==4) {
                map.put(index,"ghi")
            }
            if(index==5) {
                map.put(index,"jkl")
            }
            if(index==6) {
                map.put(index,"mno")
            }
            if(index==7) {
                map.put(index,"pqrs")
            }
            if(index==8) {
                map.put(index,"tuv")
            }
            if(index==9) {
                map.put(index,"wxyz")
            }
        }
    //    println(map)


        fun dfs(start:Int) {

            if(phoneNumber_StringBuilder.length == digits.length) {
    //            println("//추가한 값, ${phoneNumber_StringBuilder.toString()}")
                result.add(phoneNumber_StringBuilder.toString())
                return
            }

            val phoneNumber = map.get(digits[start].toString().toInt())

            for(value in phoneNumber.toString()) {
                phoneNumber_StringBuilder.append(value)
    //            println("바로 추가, ${phoneNumber_StringBuilder.toString()}")
                dfs(start+1)
    //            println("함수 탈출, ${phoneNumber_StringBuilder.toString()}")
                phoneNumber_StringBuilder.deleteCharAt(phoneNumber_StringBuilder.length-1)
    //            println("삭제 한 후, ${phoneNumber_StringBuilder.toString()}")
            }

        }
    //    result.forEach { print(it) }

        dfs(0)

        return result
    }
}