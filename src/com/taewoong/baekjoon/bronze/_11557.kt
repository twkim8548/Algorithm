package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val n = br.readLine().toInt()
        val map = mutableMapOf<String, Int>()
        repeat(n) {
            val token = StringTokenizer(br.readLine())
            map[token.nextToken()] = token.nextToken().toInt()
        }

        bw.write("${map.toList().sortedByDescending { it.second }[0].first}\n")
    }
    bw.flush()
    bw.close()

    br.close()
}