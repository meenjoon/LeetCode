import kotlin.math.min

class Solution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {


        var sum = 0
        var start = 0
        val lengthList = mutableListOf<Int>()
        var minNum = Int.MAX_VALUE
        var totalNums = 0


        for(end in 0 until  nums.size) {
            totalNums += nums[end]

            sum += nums[end]

            while (sum >= target) {

                lengthList.add(end-start+1)
                sum -= nums[start]
                start++
            }

        }

        if(totalNums<target) {
            minNum = 0
        }
        else if(totalNums == target) {
            minNum = nums.size
        }
        else {
            for((index,value) in lengthList.withIndex()) {
                if(minNum>=value){
                    minNum = value
                }
            }
        }


        return minNum
    }
}