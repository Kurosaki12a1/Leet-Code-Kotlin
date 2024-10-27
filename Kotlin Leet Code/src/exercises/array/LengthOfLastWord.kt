package exercises.array

class LengthOfLastWord {
    companion object {
        fun lengthOfLastWord(s: String): Int {
            var length = 0
            var i = s.length - 1

            // Skip trailing spaces from the end of the string
            while (i >= 0 && s[i] == ' ') {
                i--
            }

            // Count the length of the last word
            while (i >= 0 && s[i] != ' ') {
                length++
                i--
            }

            return length
        }
    }
}