package exercises.string

class LongestSubStringWithoutRepeat {
    companion object {
        fun lengthOfLongestSubstring(s: String): Int {
            val seen = mutableSetOf<Char>() // Set to store unique characters
            var maxLength = 0 // Variable to store the maximum length
            var left = 0 // Left pointer for the sliding window

            // Loop through the string with the right pointer
            for (right in s.indices) {
                // If the character is already in the set, remove characters from the left until it's unique
                while (s[right] in seen) {
                    seen.remove(s[left]) // Remove the leftmost character
                    left++ // Move the left pointer to the right
                }

                // Add the current character to the set
                seen.add(s[right])

                // Update the maximum length of the substring
                maxLength = maxOf(maxLength, right - left + 1)
            }

            return maxLength // Return the maximum length found
        }

        fun lengthOfLongestSubstring2(s: String): Int {
            val charIndexMap = mutableMapOf<Char, Int>() // Map to store the latest index of each character
            var maxLength = 0 // Store the maximum length of the substring
            var left = 0 // Left pointer for the sliding window

            // Iterate through the string with the right pointer
            for (right in s.indices) {
                // If the character is already in the map and its index is within the current window
                if (s[right] in charIndexMap && charIndexMap[s[right]]!! >= left) {
                    // Move the left pointer to skip past the repeating character
                    left = charIndexMap[s[right]]!! + 1
                }

                // Update the latest index of the current character
                charIndexMap[s[right]] = right

                // Update the maximum length of the substring
                maxLength = maxOf(maxLength, right - left + 1)
            }

            return maxLength // Return the maximum length found
        }
    }
}