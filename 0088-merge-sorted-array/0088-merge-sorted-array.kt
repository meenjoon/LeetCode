class Solution {
        fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {

        val list = mutableListOf<Int>()



        for(nums1Index in 0 until m) {
            list.add(nums1[nums1Index])
        }
        for(nums2Index in 0 until n) {
            list.add(nums2[nums2Index])
        }
        list.sort()

        for(temp in 0 until list.size) {
            nums1[temp] = list[temp]
        }

//        nums1.forEach { print(it) }

    }

}