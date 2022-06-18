package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == null || string == "") {
            break
        }
        val token = StringTokenizer(string)
        val n = token.nextToken().toInt()

        val map = mutableMapOf<Int, Boolean>()

        for (i in 1 until n) {
            map[i] = false
        }

        val array = IntArray(n)
        repeat(array.size) {
            array[it] = token.nextToken().toInt()
        }

        for (i in 0 until array.size - 1) {
            map[abs(array[i + 1] - array[i])] = true
        }

        var isJolly = true
        map.forEach {
            if (!it.value) isJolly = false
        }

        if (isJolly) bw.write("Jolly\n")
        else bw.write("Not jolly\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
