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
    val a = token.nextToken()
    val b = token.nextToken()

    var ans = a.length

    for (i in 0 .. b.length - a.length) {
        var tmp = 0
        for (j in 0 until a.length) {
            if (a[j] != b[j+i]) {
                tmp++
            }
        }
        if (ans > tmp) ans = tmp
    }

    bw.write("$ans")
    bw.flush()
    bw.close()

    br.close()
}
