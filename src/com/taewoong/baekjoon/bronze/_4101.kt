package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        val first = token.nextToken().toInt()
        val second = token.nextToken().toInt()

        if (first == 0 && second == 0) {
            break
        }

        if (first > second) {
            bw.write("Yes\n")
        } else {
            bw.write("No\n")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}