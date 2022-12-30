class Solution {
    fun dailyTemperatures(temperatures: IntArray): IntArray {
        val tempArray = IntArray(temperatures.size) {0}

        for(index in 0 until temperatures.size) {
            for(index2 in index until temperatures.size) {

                if(temperatures[index] < temperatures[index2]) {
                    var goalTemp = index2 - index
                    tempArray[index] = goalTemp
                    break
                }

            }
        }
        tempArray.forEach { print(it) }

        return tempArray
    }
}