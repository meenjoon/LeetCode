class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        val numList = mutableListOf<Int>()
    
        if(nums1.isNotEmpty()){
            for(index in 0 until m) {
                numList.add(nums1[index])
            }
        }

        if(nums2.isNotEmpty()){
            for(index in 0 until n) {
                numList.add(nums2[index])
            }
        }

        numList.sort()

        for(temp in 0 until nums1.size) {
            nums1[temp] = numList[temp]

        }

//        nums1.forEach { print(it) }


    }

}