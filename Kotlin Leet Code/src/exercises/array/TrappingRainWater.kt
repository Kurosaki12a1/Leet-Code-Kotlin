package exercises.array

import kotlin.math.max
import kotlin.math.min

class TrappingRainWater {
    companion object {
        fun trap1(height: IntArray): Int {
            var totalWater = 0
            for (index in 0..<height.size) {
                var left = index
                var right = index
                var maxLeft = 0
                var maxRight = 0
                while (left >= 0) {
                    maxLeft = max(maxLeft, height[left])
                    left--
                }
                while (right < height.size) {
                    maxRight = max(maxRight, height[right])
                    right++
                }
                val currentWater = min(maxLeft, maxRight) - height[index]
                if (currentWater >= 0) {
                    totalWater += currentWater
                }
            }
            return totalWater
        }

        fun trap2(height: IntArray) : Int {
            var left = 0 // Left pointer
            var right = height.size - 1 // Right pointer
            var leftMax = 0 // Maximum height to the left
            var rightMax = 0 // Maximum height to the right
            var waterTrapped = 0 // Total water trapped

            // Use two pointers to traverse the array from both ends
            while (left <= right) {
                println("left: $left, right: $right")
                if (height[left] <= height[right]) {
                    // If the current height on the left is smaller, mean the next is the wall
                    if (height[left] >= leftMax) {
                        println("update LeftMax: ${height[left]}")
                        leftMax = height[left] // Update leftMax
                    } else {
                        // The next is valley
                        println("update waterTrapped of left: $waterTrapped")
                        waterTrapped += leftMax - height[left] // Add trapped water
                    }
                    left++ // Move the left pointer right
                } else {
                    // If the current height on the right is smaller, mean the left is the wall
                    if (height[right] >= rightMax) {
                        println("update rightMax: ${height[right]}")
                        rightMax = height[right] // Update rightMax
                    } else {
                        // The next is valley
                        println("update waterTrapped of right: $waterTrapped")
                        waterTrapped += rightMax - height[right] // Add trapped water
                    }
                    right-- // Move the right pointer left
                }
            }

            return waterTrapped // Return the total water trapped
        }
    }
}