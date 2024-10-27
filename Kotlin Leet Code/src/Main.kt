import exercises.array.TrappingRainWater

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    /*    val romanToInteger = exercises.array.RomanToInteger()
        val value = romanToInteger.romanToInt("MCMXCIV")
        println("value: $value")*/
    /*    val value =  "(]"
        val result = exercises.array.ValidParentheses().isValid(value)
        println("result: $result")*/
    /*    val haystack = "mississippi"
        val needle = "issip"
        val result = IndexOfFirstOccurrenceString.strStr(haystack, needle)
        println("result: $result")*/
    /*   val nums = intArrayOf(1,3,5,6)
       val target = 5
       val result = SearchInsertPosition.searchInsert(nums, target)
       println("result: $result")*/
    val height = intArrayOf(0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2)
    val result = TrappingRainWater.trap2(height)
    println("result: $result")
}

