package lv1.rectangular_star

class Solution {
    fun main(args: Array<String>) {
        val (a, b) = readLine()!!.split(' ').map(String::toInt)
        val answers = List(b){
            List(a){
                "*"
            }
        }
        println(answers.joinToString(""){
            it.joinToString("")+"\n"
        })
    }
}