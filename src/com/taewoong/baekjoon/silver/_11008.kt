package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        var s = token.nextToken()
        val p = token.nextToken()

        if (s.contains(p)) {
            s = s.replace(p, "a")
        }

        bw.write("${s.length}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}