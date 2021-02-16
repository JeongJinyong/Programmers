import lv2.function_development.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution(intArrayOf(93,30,55),intArrayOf(1,30,5)).joinToString())
            println(solution.solution(intArrayOf(95,90,99,99,80,99),intArrayOf(1,1,1,1,1,1)).joinToString())
        }
    }
}