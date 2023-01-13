class LRUCache(capacity: Int) {

    val linkedHashMap = LinkedHashMap<Int,Int>(16, 0.75f, true)

    val cap = capacity

    fun get(key: Int): Int {
        if(linkedHashMap.containsKey(key)) {

            return linkedHashMap.getValue(key)
        }
        else {
            return -1
        }
    }

    fun put(key: Int, value: Int) {

        if(linkedHashMap.containsKey(key)) {
            linkedHashMap.put(key,value)
        }
        else {

            if (linkedHashMap.size >= cap) {
                val lastKey = linkedHashMap.keys.iterator().next() //iterator().next() 코드는 첫번째 요소를 반환한다.
                println("lastKey : $lastKey")

                linkedHashMap.remove(lastKey)
                linkedHashMap.put(key, value)
            } else {
                linkedHashMap.put(key, value)

            }
        }

    }

}

/**
 * Your LRUCache object will be instantiated and called as such:
 * var obj = LRUCache(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */