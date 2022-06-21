package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val n = br.readLine().toInt()
        if (n == 0) {
            break
        }
        val map = mutableMapOf<String, Double>()
        repeat(n) {
            val token = StringTokenizer(br.readLine())
            map[token.nextToken()] = token.nextToken().toDouble()
        }


        val list = map.toList().sortedByDescending { it.second }
        val max = list[0].second
        list.forEach {
            if (max == it.second) {
                bw.write("${it.first} ")
            }
        }
        bw.write("\n")
    }
    bw.flush()
    bw.close()

    br.close()
}