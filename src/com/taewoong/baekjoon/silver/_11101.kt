package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val condition = br.readLine().split(",")
        val map = mutableMapOf<String, Int>()
        condition.forEach {
            map[it.split(":")[0]] = it.split(":")[1].toInt()
        }

        val combination = br.readLine().split("|")
        val answer = IntArray(combination.size)
        combination.forEachIndexed { index, s ->
            var max = 0
            s.split("&").forEach { combi ->
                if (max < map[combi]!!) {
                    max = map[combi]!!
                }
            }
            answer[index] = max
            max = 0
        }
        bw.write("${answer.minOrNull()}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}