class Solution {
    fun combine(n: Int, k: Int): List<List<Int>> {

        val ansList = mutableListOf<MutableList<Int>>()

        val intArrayList = ArrayList<Int>()

        fun combidfs(start: Int) {

            if(intArrayList.size == k) {
                ansList.add(intArrayList.toMutableList())
                return
            }

            for(index in start .. n) {
                intArrayList.add(index)
                combidfs(index+1)
                intArrayList.removeAt(intArrayList.size-1)

            }
        }
        combidfs(1)

        ansList.forEach { print(it) }

        return ansList
    }
}