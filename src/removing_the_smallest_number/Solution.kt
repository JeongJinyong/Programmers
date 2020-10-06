package removing_the_smallest_number

class Solution {
    fun solution(arr: IntArray): IntArray {
        if (arr.size == 1 || arr.isEmpty()) {
            return intArrayOf(-1)
        }
        var small = -1
        arr.forEach {
            if (small == -1 || small > it) small = it
        }

        return arr.toMutableList().let {
            it.remove(small)
            it.toIntArray()
        }
    }
}