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

    var l = token.nextToken().toInt()
    var r = token.nextToken().toInt()
    var a = token.nextToken().toInt()

    while (a != 0) {
        if (l < r) {
            l++
            a--
        } else if (r < l) {
            r++
            a--
        } else {
            r += a/2
            l += a/2
            break
        }
    }

    if (l < r) {
        bw.write("${l * 2}")
    } else {
        bw.write("${r * 2}")
    }
    bw.flush()
    bw.close()

    br.close()

}
