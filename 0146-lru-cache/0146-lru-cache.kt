class LRUCache(capacity: Int) {

    val linkedHashMap = LinkedHashMap<Int,Int>(16, 0.75f, true) //LinkedHashMap 컬렉션을 생성한다.

    val cap = capacity //용량

    fun get(key: Int): Int { //값이 있나 없나 가져오는 함수, LinkedHashMap를 만들때 accessOrder 매개변수를 true로 해줬기 때문에 이 함수를 사용하면 사용된 매개변수의 값을 오른쪽으로 배치되고 사용하지 않는 나머지 값들은 왼쪽으로 배치된다.
        // Ex) linkedHashMap에 [1,1], [2,2] 이러한 순서로 저장되어 있다. get(1) 함수를 호출하게되면 매개변수 key 값인 1을 사용했기 때문에 순서는 사용하지 않은 [2,2] 가 왼쪽으로 재배치 되어 linkedHashMap에 저장된 최종 순서는  [2,2] [1,1]
        if(linkedHashMap.containsKey(key)) { //LinkedHashMap에 매개변수 값 key가 들어있으면

            return linkedHashMap.getValue(key) //포함된 키 값의 Value를 return 한다.
        }
        else { //포함되어 있지 않으면 return을 하는데 이 값은 -1이다.
            return -1
        }
    }

    fun put(key: Int, value: Int) { //값을 넣는 함수이다.

        if(linkedHashMap.containsKey(key)) { //만약 이미 있는 값이라면
            linkedHashMap.put(key,value) //있는 값을 덮어쓴다. 즉, 매개변수로 받은 key와 value의 값으로 다시 넣어준다.
        }
        else { // 있지 않은 값이라면

            if (linkedHashMap.size >= cap) { //linkedHashMap에 저장된 사이즈가 용량보다 크다면 최근에 사용하지 않은 key 값을 지우고 매개변수에 있는 key와 value를 넣어준다.
                val lastKey = linkedHashMap.keys.iterator().next() // iterator().next() 코드는 linkedHashMap에서 첫번째 요소를 반환한다.
//                println("lastKey : $lastKey")

                linkedHashMap.remove(lastKey) //linkedHashMap에서 lastKey를 지운다. 왜냐하면 용량이 크기때문에 최근에 사용하지 않는 키와 값을 지워야 하는것이다.
                linkedHashMap.put(key, value) //위에서 키를 지웠고 용량이 충분해졌으니 매개변수 값 key value를 넣어준다.
            } else { //linkedHashMap가 용량보다 작기때문에 linkedHashMap에 key와 value를 넣어준다.
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