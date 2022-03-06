package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    repeat(5) {
        if (br.readLine().contains("FBI")) {
            cnt++
            bw.write("${it + 1}\n")
        }
    }
    if (cnt == 0) {
        bw.write("HE GOT AWAY!")
    }

    bw.flush()
    bw.close()
    br.close()
}
