package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    br.readLine().forEach {
        if (it.isUpperCase()) {
            bw.write(it.lowercase())
        } else {
            bw.write(it.uppercase())
        }
    }

    bw.flush()
    bw.close()
    br.close()
}