import hide_cell_phone_number.Solution

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            println(solution.solution("01033334444"))
            println(solution.solution("027778888"))
        }
    }
}