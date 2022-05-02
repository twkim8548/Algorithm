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
    var map = mutableMapOf<Int, Int>()
    var answer = mutableMapOf<Int, Int>()

    for (i in 1..n) {
        map[i] = 0
        answer[i] = 0
    }
    repeat((n * (n - 1)) / 2) {
        val token = StringTokenizer(br.readLine())
        val a = token.nextToken().toInt()
        val b = token.nextToken().toInt()
        val c = token.nextToken().toInt()
        val d = token.nextToken().toInt()

        if (c > d) {
            map[a] = map[a]!!.plus(3)
        } else if (d > c) {
            map[b] = map[b]!!.plus(3)
        } else if (d == c) {
            map[a] = map[a]!!.plus(1)
            map[b] = map[b]!!.plus(1)
        }
    }

    map = map.toList().sortedByDescending { it.second }.toMap().toMutableMap()

    var rank = 1
    var score = -1
    var team = 0
    map.forEach {
        if (score != it.value) {
            answer[it.key] = rank
        } else {
            answer[it.key] = answer[team]!!
        }
        team = it.key
        score = it.value
        rank++
    }

    answer.forEach {
        bw.write("${it.value}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}
