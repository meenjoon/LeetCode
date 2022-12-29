class Solution {
    fun lengthOfLongestSubstring(s : String) : Int {

        val set = mutableSetOf<Char>()

        var start = 0

        var lengthlist = mutableListOf<Int>()

        var maxlength = 0

        for(end in 0 until s.length) {

//            set.add(s[end])
            val char = s[end]
            while (set.contains(char)) {
                println("start : $start end : $end")
                set.remove(s[start])
                start++
            }
            println("start : $start end : $end")
            lengthlist.add(end-start+1)

             set.add(char)
            println(set)

        }

        if(s.isEmpty()) {

            maxlength = 0
        }
        else if(s == " " || s.length == 1) {
            maxlength = 1
        }

        else {
            for((index,value) in lengthlist.withIndex()) {
//                println(value)
                if (maxlength<= value) {

                    maxlength = value

                }
            }
        }



//        println(maxlength)


        return maxlength
    }
}