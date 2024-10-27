package exercises.array

import java.util.Stack

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()

        for (char in s) {
            println("value: $char")
            if (stack.empty() || char == '(' || char == '{' || char == '[') {
                println("push: $char")
                stack.push(char)
            }
            else if (char == ')' && stack.peek() == '(') {
                println("pop: ()")
                stack.pop()
            }
            else if (char == ']' && stack.peek() == '[') {
                println("pop: []")
                stack.pop()
            }
            else if (char == '}' && stack.peek() == '{') {
                println("pop: {}")
                stack.pop()
            }
            else {
                return false
            }
        }
        return stack.isEmpty()
    }
}