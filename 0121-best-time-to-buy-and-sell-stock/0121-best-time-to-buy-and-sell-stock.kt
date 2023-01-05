class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0

        val list = mutableListOf<Int>()

        var ansMax = 0

        for(index in 0 until prices.size) {
            for(index2 in index until prices.size) {
                if(prices[index] != prices[index2] && prices[index] <= prices[index2]) {
                    max = prices[index2] - prices[index]
    //                println("index : $index index2 : $index2 max: $max")
                    list.add(max)
                }
                else if(index == index2) {
                    continue
                }
                else {
                    break
                }
            }
        }

        for(index in 0 until list.size) {
            if(ansMax<=list[index]) {
                ansMax = list[index]
            }
        }
        println(ansMax)


        return ansMax
    }
}