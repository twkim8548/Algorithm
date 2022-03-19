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

    val e = token.nextToken().toInt()
    val f = token.nextToken().toInt()
    val c = token.nextToken().toInt()

    var bottle = e + f
    var answer = 0

    while (bottle >= c) {
        answer += bottle / c
        bottle = bottle / c + bottle % c
    }

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()

}
