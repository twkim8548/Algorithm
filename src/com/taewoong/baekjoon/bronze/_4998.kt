package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string == null || string == "") {
            break
        }
        val token = StringTokenizer(string)
        var money = token.nextToken().toDouble()

        val interest = token.nextToken().toDouble()
        val target = token.nextToken().toDouble()
        var year = 0
        while (money <= target) {
            year++
            money += money * interest / 100
        }

        bw.write("$year\n")
    }
    bw.flush()
    bw.close()

    br.close()
}