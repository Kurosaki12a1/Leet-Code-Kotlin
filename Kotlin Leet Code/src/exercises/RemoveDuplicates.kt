package exercises

class RemoveDuplicates {
    val arr = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)

    fun removeDuplicates(nums: IntArray): Int {
        var count = 0
        var i = 0
        //  var j = 0
        for (index in nums.indices) {
            if (nums[i] == nums[index]) {
                count++
                if (count == 2) {
                    nums[i] = nums[index]
                    i++
                } else {
                    i++
                }
            } else {
                count = 0
                nums[i] = nums[index]
                i++
            }
        }
        for (index in 0 until i) {
            print("${nums[index]} ")
        }
        return i
    }
}