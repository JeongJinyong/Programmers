import get_the_middle_character.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution("abcdefghijklmnopqrstuvwxyz"))
            println(solution.solution("abcde"))
            println(solution.solution("qwer"))
        }
    }
}