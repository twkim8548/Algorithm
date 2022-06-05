package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val a = token.nextToken().toInt()
    val b = token.nextToken().toInt()

    val array = ArrayList<Int>()

    for (i in 1..b) {
        for (j in 0 until i) {
            array.add(i)
        }
    }

    var answer = 0
    for (i in a..b) {
        answer += array[i - 1]
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()
}