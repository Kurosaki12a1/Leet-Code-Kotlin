import exercises.IndexOfFirstOccurrenceString
import exercises.SearchInsertPosition

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
/*    val romanToInteger = exercises.RomanToInteger()
    val value = romanToInteger.romanToInt("MCMXCIV")
    println("value: $value")*/
/*    val value =  "(]"
    val result = exercises.ValidParentheses().isValid(value)
    println("result: $result")*/
/*    val haystack = "mississippi"
    val needle = "issip"
    val result = IndexOfFirstOccurrenceString.strStr(haystack, needle)
    println("result: $result")*/
    val nums = intArrayOf(1,3,5,6)
    val target = 5
    val result = SearchInsertPosition.searchInsert(nums, target)
    println("result: $result")
}

