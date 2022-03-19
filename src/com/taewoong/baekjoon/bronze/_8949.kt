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

    var a = token.nextToken()
    var b = token.nextToken()

    if (a.length < b.length) {
        while (a.length < b.length)
            a = "0$a"
    } else if (b.length < a.length) {
        while (b.length < a.length)
            b = "0$b"
    }

    for (i in a.indices) {
        bw.write("${a[i].toString().toInt() + b[i].toString().toInt()}")
    }

    bw.flush()
    br.close()
    br.close()
}
