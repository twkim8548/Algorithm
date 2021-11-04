package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    var a = token.nextToken().toInt()
    var b = token.nextToken().toInt()
    val c = a * b
    var d = 0
    while (true) {
        d = a % b
        if (d == 0) {
            bw.write("$b\n${c / b}")
            break
        } else {
            a = b
            b = d
        }
    }

    bw.flush()
    bw.close()

    br.close()
}
