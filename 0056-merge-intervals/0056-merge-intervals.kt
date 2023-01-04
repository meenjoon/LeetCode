class Solution {
fun merge(intervals: Array<IntArray>): Array<IntArray> {

        intervals.sortBy { it[0] }

//        intervals.forEach { it.forEach { print(it) } }
        val ansArrayList = ArrayList<IntArray>()

        var first = intervals[0][0]
        var second = intervals[0][1]
        if(intervals.size>1) {
            for (index in 1 until intervals.size) {

                if (second >= intervals[index][0]) {
                    if (second > intervals[index][1]) {
                        first = first
                        second = second
                    } else {
                        first = first
                        second = intervals[index][1]
                    }
                }
                else {
                    ansArrayList.add(intArrayOf(first, second))
                    first = intervals[index][0]
                    second = intervals[index][1]
                }
//            println("index : $index first : $first second : $second")
            }
            ansArrayList.add(intArrayOf(first, second))
        }
        else {
            ansArrayList.add(intArrayOf(first, second))
        }

        // ansArrayList.forEach { it.forEach { print(it) } }

        return ansArrayList.toTypedArray()
    }
}