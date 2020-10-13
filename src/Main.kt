import failure_rate.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution(5, intArrayOf(2,1,2,6,2,4,3,3)).joinToString { "$it" })
            println(solution.solution(4, intArrayOf(3,3,3,3,3)).joinToString { "$it" })
        }
    }
}