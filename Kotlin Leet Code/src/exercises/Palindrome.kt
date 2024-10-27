package exercises

class Palindrome {
    fun isPalindrome(x : Int) : Boolean {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false

        var reversedHalf = 0
        var num = x

        // Đảo ngược nửa sau của số và so sánh với nửa đầu
        while (num > reversedHalf) {
            reversedHalf = reversedHalf * 10 + num % 10
            num /= 10
        }

        // Kiểm tra xem hai nửa có bằng nhau không
        return num == reversedHalf || num == reversedHalf / 10
    }
}