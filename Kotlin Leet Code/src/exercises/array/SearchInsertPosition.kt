package exercises.array

class SearchInsertPosition {

    companion object {
        fun searchInsert(nums: IntArray, target: Int): Int {
            var left = 0
            var right = nums.size - 1

            // Binary search to find the target or insertion point
            while (left <= right) {
                val mid = left + (right - left) / 2

                if (nums[mid] == target) {
                    return mid // Target found, return its index
                } else if (nums[mid] < target) {
                    left = mid + 1 // Search in the right half
                } else {
                    right = mid - 1 // Search in the left half
                }
            }

            /**
            Giả sử bạn có mảng đã được sắp xếp:
            [1, 3, 5, 7, 9, 11, 13]
            Và bạn cần tìm 9.

            Bước 1: Tìm chỉ số giữa:

            mid = (0 + 6) / 2 = 3.
            arr[3] = 7.
            7 < 9, vậy tìm ở nửa phải (bỏ các phần tử bên trái).
            left = 4
            Bước 2: Giới hạn không gian tìm kiếm ở [9, 11, 13].

            mid = (4 + 6) / 2 = 5.
            arr[5] = 11.
           -> right = 4
            11 > 9, vậy tìm ở nửa trái (bỏ phần tử lớn hơn).
            Bước 3: Giới hạn không gian ở [9].

            mid = (4 + 4) / 2 = 4.
            arr[4] = 9.
            Đã tìm thấy 9 tại vị trí 4.
            **/


            // If target is not found, left will be the insertion point
            return left
        }
    }
}