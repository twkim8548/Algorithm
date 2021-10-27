package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.max

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var s = 0
    var t = 0

    repeat(2) {
        val token = StringTokenizer(br.readLine())
        if (it == 1) {
            repeat(4) {
                s += token.nextToken().toInt()
            }
        } else {
            repeat(4) {
                t += token.nextToken().toInt()
            }
        }
    }

    bw.write("${max(s, t)}")
    bw.flush()
    bw.close()

    br.close()
}
