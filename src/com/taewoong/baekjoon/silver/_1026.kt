package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val aArray = IntArray(n)
    val bArray = IntArray(n)

    var token = StringTokenizer(br.readLine())
    repeat(n) {
        aArray[it] = token.nextToken().toInt()
    }

    token = StringTokenizer(br.readLine())
    repeat(n) {
        bArray[it] = token.nextToken().toInt()
    }

    aArray.sortDescending()
    bArray.sort()

    var answer = 0
    repeat(n) {
        answer += aArray[it] * bArray[it]
    }

    bw.write("$answer")

    bw.flush()
    bw.close()

    br.close()
}