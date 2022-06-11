package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val s = br.readLine()

    if (s.length <= 25) {
        bw.write("$s")
    } else {
        val sub = s.substring(11, n - 11)
        if (sub.contains('.') && sub.indexOf('.') != sub.length - 1) {
            bw.write("${s.substring(0, 9)}......${s.reversed().substring(0, 10).reversed()}")
        } else {
            bw.write("${s.substring(0, 11)}...${s.reversed().substring(0, 11).reversed()}")
        }

    }

    bw.flush()
    bw.close()

    br.close()
}