package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val jaehwan = br.readLine().length
    val hospital = br.readLine().length

    if (jaehwan < hospital) {
        bw.write("no")
    } else {
        bw.write("go")
    }

    bw.flush()
    bw.close()

    br.close()
}
