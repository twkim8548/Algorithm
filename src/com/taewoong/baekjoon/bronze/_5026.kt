package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val string = br.readLine()
        if (string == "P=NP") {
            bw.write("skipped\n")
        } else {
            bw.write("${string.split("+")[0].toInt() + string.split("+")[1].toInt()}\n")
        }
    }
    bw.flush()
    br.close()
    br.close()
}
