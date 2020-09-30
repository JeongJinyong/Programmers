import caesar_password.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution("a B z",4))
            println(solution.solution("z",1))
            println(solution.solution("AB",1))
        }
    }
}