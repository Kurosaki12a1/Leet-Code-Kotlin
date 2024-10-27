package exercises.string

import java.util.*

class BackSpaceString {
    companion object {
        fun backspaceCompare1(s: String, t: String): Boolean {
            val resultS: StringBuilder = StringBuilder()
            val resultY: StringBuilder = StringBuilder()

            for (word in s) {
                if (word != '#') {
                    resultS.append(word)
                } else {
                    if (resultS.isNotEmpty()) resultS.deleteCharAt(resultS.length - 1)
                }
            }

            for (word in t) {
                if (word != '#') {
                    resultY.append(word)
                } else {
                    if (resultY.isNotEmpty()) resultY.deleteCharAt(resultY.length - 1)
                }
            }

            if (resultS.length != resultY.length) {
                return false
            } else {
                for (i in resultS.indices) {
                    if (resultS[i] != resultY[i]) {
                        return false
                    }
                }
                return true
            }
        }

        // Hàm hỗ trợ để tính vị trí tiếp theo có ký tự hợp lệ
        private fun getNextValidIndex(str: String, index: Int): Int {
            var i = index
            var backCount = 0

            while (i >= 0) {
                if (str[i] == '#') {
                    backCount++ // Tăng bộ đếm backspace
                } else {
                    if (backCount > 0) {
                        backCount-- // Bỏ qua ký tự hợp lệ nếu còn backspace
                    } else {
                        return i // Trả về vị trí của ký tự hợp lệ tiếp theo
                    }
                }
                i--
            }
            return -1 // Nếu không còn ký tự hợp lệ
        }

        fun backspaceCompare2(s: String, t: String): Boolean {
            var pointS = s.length - 1
            var pointT = t.length - 1



            // So sánh các ký tự hợp lệ trong cả hai chuỗi
            while (pointS >= 0 || pointT >= 0) {
                pointS = getNextValidIndex(s, pointS)
                pointT = getNextValidIndex(t, pointT)

                // Nếu cả hai đã hết chuỗi, chúng giống nhau
                if (pointS < 0 && pointT < 0) return true

                // Nếu chỉ một chuỗi hết, chúng không giống nhau
                if (pointS < 0 || pointT < 0) return false

                // Nếu ký tự tại vị trí hợp lệ không giống nhau, trả về false
                if (s[pointS] != t[pointT]) return false

                // Di chuyển cả hai con trỏ sang trái
                pointS--
                pointT--
            }

            return true // Nếu duyệt hết và không tìm thấy khác biệt, chuỗi giống nhau
        }
    }
}