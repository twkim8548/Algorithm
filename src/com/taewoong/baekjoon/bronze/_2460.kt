package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var people = 0
    var maxNumber = 0
    repeat(10) {
        val token = StringTokenizer(br.readLine())
        val outNumber = token.nextToken().toInt()
        val inNumber = token.nextToken().toInt()

        people -= outNumber
        people += inNumber

        if (people > maxNumber) {
            maxNumber = people
        }
    }

    bw.write("$maxNumber")
    bw.flush()
    bw.close()
    br.close()
}