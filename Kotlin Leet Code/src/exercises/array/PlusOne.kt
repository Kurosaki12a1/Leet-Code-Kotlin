package exercises.array

class PlusOne {
    companion object {
        fun plusOne(digits: IntArray): IntArray {
            // Loop through the array from the end to the beginning
            for (i in digits.size - 1 downTo 0) {
                // If the current digit is less than 9, simply increment it
                if (digits[i] < 9) {
                    digits[i]++
                    return digits // Return the array since no further changes are needed
                }
                // If the current digit is 9, set it to 0 (carry the one)
                digits[i] = 0
            }

            // If all digits are 9 (e.g., 999), we need an extra digit at the beginning
            val result = IntArray(digits.size + 1) // Create a new array with an extra space
            result[0] = 1 // Set the first digit to 1 (e.g., 1000)
            return result
        }
    }
}