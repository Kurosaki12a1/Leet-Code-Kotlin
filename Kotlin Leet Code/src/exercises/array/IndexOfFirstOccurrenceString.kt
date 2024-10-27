package exercises.array

class IndexOfFirstOccurrenceString {
    companion object {
        fun strStr(haystack: String, needle: String): Int {
            val haystackLength = haystack.length
            val needleLength = needle.length

            // If needle is empty return 0
            if (needleLength == 0) return 0

            // Iterate through the haystack until the remaining part is smaller than the needle
            for (i in 0..haystackLength - needleLength) {
                var match = true
                println("value: ${haystack[i]}")
                // Compare each character of the needle with the corresponding character in haystack
                for (j in needle.indices) {
                    println("needle value: ${haystack[i+j]} and ${needle[j]}")
                    if (haystack[i + j] != needle[j]) {
                        match = false // If any character doesn't match, set match to false
                        break
                    }
                }

                // If the entire needle matches, return the starting index
                if (match) return i
            }

            return -1
        }
    }
}