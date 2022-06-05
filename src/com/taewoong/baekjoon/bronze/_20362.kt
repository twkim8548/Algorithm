package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val s = token.nextToken()

    val map = mutableMapOf<String, String>()

    repeat(n) {
        token = StringTokenizer(br.readLine())

        map[token.nextToken()] = token.nextToken()
    }
    var cnt = 0
    val answer = map[s]

    for (i in 0 until map.toList().indexOfFirst { it.first == s }) {
        if (map.toList()[i].second == answer)
            cnt++
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()

    br.close()
}