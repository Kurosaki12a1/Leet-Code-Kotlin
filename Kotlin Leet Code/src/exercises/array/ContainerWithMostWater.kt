package exercises.array

import kotlin.math.max
import kotlin.math.min

class ContainerWithMostWater {
    companion object {
        fun maxArea1(height: IntArray): Int {
            var maxArea = 0
            for (i in height.indices) {
                for (j in i + 1..<height.size) {
                    val heightArea = min(height[i], height[j])
                    val width = j - i
                    val area = width * heightArea

                    maxArea = max(area, maxArea)
                }
            }
            return maxArea
        }

        fun maxArea2(height: IntArray): Int {
            var left = 0
            var right = height.size - 1
            var maxArea = 0
            while (left < right) {
                val heightArea = min(height[left], height[right])
                val width = right - left
                val area = width * heightArea
                maxArea = max(area, maxArea)
                if (height[left] <= height[right]) {
                    left++
                } else {
                    right--
                }
            }
            return maxArea
        }
    }
}