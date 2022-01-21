package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    val students = IntArray(n)
    var isBoomTimes = BooleanArray(c + 1) { false }
    var count = 0

    repeat(n) {
        students[it] = br.readLine().toInt()
    }

    students.forEach {
        for (i in it .. c) {
            if (i % it == 0 && !isBoomTimes[i]) {
                count++
                isBoomTimes[i] = true
            }
        }
    }

    bw.write("$count")
    bw.flush()

    bw.close()
    br.close()
}