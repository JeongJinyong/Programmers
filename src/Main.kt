import guess_the_colatz.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution(6))
            println(solution.solution(16))
            println(solution.solution(626331))
        }
    }
}