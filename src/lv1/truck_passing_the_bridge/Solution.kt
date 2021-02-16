package lv1.truck_passing_the_bridge

import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 0
        val truck :Queue<Truck> = LinkedList()
        val ingTruck :Queue<Truck> = LinkedList()
        var bridgeWeight = 0

        for (weight in truck_weights) {
            truck.offer(Truck(weight, 0))
        }

        while (true) {
            //대기큐에 트럭이 있을 경우
            if (truck.isNotEmpty()) {
                // 다리가 무게 견딜수 있는 트럭인 경우 트럭 poll(출발)
                if (truck.peek().weight + bridgeWeight <= weight) {
                    with(truck.poll()) {
                        bridgeWeight += this.weight
                        ingTruck.offer(this)
                    }
                }
            }
            //다리 위 트럭이동
            for (truck2: Truck in ingTruck) {
                truck2.postion++
            }
            //도착한 트럭 빼기
            if (ingTruck.peek().postion >= bridge_length) {
                bridgeWeight -= ingTruck.poll().weight
            }
            //총 걸린 시간 증가(결과)
            answer++
            // 다 끝난 경우
            if(truck.isEmpty() && ingTruck.isEmpty()){
                break
            }
        }
        return answer + 1//마지막 빠져나오는 시간떄문에 +1
    }

    //트럭무게, 현재위치
    data class Truck(var weight: Int, var postion: Int)
}