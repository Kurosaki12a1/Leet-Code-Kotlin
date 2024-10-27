package exercises.array

class RomanToInteger {

  /* enum class Symbol(val value: Int) {
       I(1),
       V(5),
       X(10),
       L(50),
       C(100),
       D(500),
       M(1000)
   }*/


    fun romanToInt(s : String)  : Int {
        val romanValues = mapOf (
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var total = 0
        var preValue = 0

        for (char in s.reversed()) {
            val value = romanValues[char] ?: 0

            if (value < preValue) {
                total -=value
            } else {
                total += value
            }
            preValue = value
        }
        return total
    }
}