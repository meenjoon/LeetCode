class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {

//        val list = MutableList<Int>(temperatures.size,{it->0})

        val intArray = IntArray(temperatures.size){0} //

//        list.forEach { print(it) }
//        println()

        for (index in 0 until temperatures.size) {

            for (index2 in index until temperatures.size) {
                if (temperatures[index]<temperatures[index2]) {
                    val length = index2-index
                    // println("$length")
                    intArray[index] = length
                    break
                }

            }
        }
//        list.forEach { print(it) }

        return intArray
    }
}