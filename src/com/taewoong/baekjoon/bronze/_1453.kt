package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = BooleanArray(100) { false }

    val n = br.readLine().toInt()
    val token = StringTokenizer(br.readLine())

    var answer = 0
    repeat(n) {
        val number = token.nextToken().toInt() - 1
        if (!array[number]) {
            array[number] = true
        } else {
            answer++
        }
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()


}