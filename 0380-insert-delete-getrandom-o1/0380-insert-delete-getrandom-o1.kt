class RandomizedSet() {
    val map = mutableMapOf<Int,Int>()


    fun insert(`val`: Int): Boolean {
        
        if(map.containsKey(`val`)) {
            return false
        }
        else {
            map.put(`val`,map.getOrDefault(`val`,0) + 1)
            return true
        }
    }

    fun remove(`val`: Int): Boolean {
        if (map.containsKey(`val`)) {
            map.remove(`val`)
            return true
        }
        else {
            return false
        }
    }

    fun getRandom(): Int {
        return map.keys.random()
    }

}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * var obj = RandomizedSet()
 * var param_1 = obj.insert(`val`)
 * var param_2 = obj.remove(`val`)
 * var param_3 = obj.getRandom()
 */