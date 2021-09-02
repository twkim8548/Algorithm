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

    var a = token.nextToken().toInt()
    var b = token.nextToken().toInt()

    if (b >= 45) {
        b -= 45
    } else {
        if (a > 0)
            a -= 1
        else
            a = 23
        b = 60 - (45 - b)
    }

    bw.write("$a $b")
    bw.flush()
    bw.close()

    br.close()
}
