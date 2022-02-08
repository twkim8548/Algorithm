package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val reward = IntArray(n) { 0 }

    repeat(n) {
        var dices = br.readLine().split(" ")
        dices = dices.sorted()

        val diceMap = dices.groupBy { it.toInt() % 6 }

        var isTwo = false
        var twoNumber = 0

        diceMap.forEach { map ->
            if (map.value.size == 4) {
                if (50000 + (map.value[0].toInt() * 5000) > reward[it]) {
                    reward[it] = 50000 + (map.value[0].toInt() * 5000)
                }
            } else if (map.value.size == 3) {
                if (10000 + (map.value[0].toInt() * 1000) > reward[it]) {
                    reward[it] = 10000 + (map.value[0].toInt() * 1000)
                }
            } else if (map.value.size == 2) {
                if (isTwo) {
                    if (2000 + (twoNumber * 500) + (map.value[0].toInt() * 500) > reward[it])
                        reward[it] = 2000 + (twoNumber * 500) + (map.value[0].toInt() * 500)
                }
                if (1000 + (map.value[0].toInt() * 100) > reward[it])
                    reward[it] = 1000 + (map.value[0].toInt() * 100)
                twoNumber = map.value[0].toInt()
                isTwo = true
            } else {
                if (dices[3].toInt() * 100 > reward[it])
                    reward[it] = dices[3].toInt() * 100
            }
        }
    }


    bw.write("${reward.maxOrNull()}")

    bw.flush()
    bw.close()
    br.close()
}