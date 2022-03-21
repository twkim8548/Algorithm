package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        bw.write("String #${it + 1}\n")
        br.readLine().forEach {
            if (it == 'Z') {
                bw.write("A")
            } else {
                bw.write((it.code + 1).toChar().toString())
            }
        }
        bw.write("\n\n")
    }
    bw.flush()
    bw.close()
    br.close()
}