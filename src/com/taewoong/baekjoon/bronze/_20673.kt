package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val p = br.readLine().toInt()
    val q = br.readLine().toInt()

    if (q <= 10) {
        if (p <= 50) {
            bw.write("White")
        } else {
            bw.write("Yellow")
        }
    } else if (q >= 30) {
        bw.write("Red")
    } else {
        bw.write("Yellow")
    }

    bw.flush()
    bw.close()

    br.close()


}
