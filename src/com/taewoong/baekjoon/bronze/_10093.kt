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
    var a = token.nextToken().toLong()
    var b = token.nextToken().toLong()

    if (a == b) {
        bw.write("0\n")
    } else if (a < b) {
        bw.write("${b - a - 1}\n")
        for (i in a + 1 until b) {
            bw.write("$i ")
        }
    } else if (a > b) {
        val temp = a
        a = b
        b = temp
        bw.write("${b - a - 1}\n")
        for (i in a + 1 until b) {
            bw.write("$i ")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
