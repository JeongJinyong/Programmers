import arrange_your_own_strings.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution(arrayOf("sun", "bed", "car"),1).joinToString { it })
            println(solution.solution(arrayOf("abce", "abcd", "cdx"),2).joinToString { it })
        }
    }
}