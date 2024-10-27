package exercises

class SumArray {

    private val list = intArrayOf(2,7,11,5)
    private val target = 11

    fun calculatePair(): Pair<Int, Int>? {
        val map = HashMap<Int, Int>()
        for (element in list.indices) {
            val mapValue = map[list[element]]
            if (mapValue != null && mapValue >= 0) {
                return Pair(mapValue, element)
            } else {
                val numberToFind = target - list[element]
                map[numberToFind] = element
            }
        }
        return null
    }

}