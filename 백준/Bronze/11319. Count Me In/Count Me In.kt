package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var vowelCnt = 0
    var consonantCnt = 0

    repeat(br.readLine().toInt()) {
        br.readLine().uppercase().replace(" ", "").forEach {
            if (it == 'A' || it == 'E' || it == 'I' || it == 'O' || it == 'U') vowelCnt++
            else consonantCnt++
        }
        bw.write("$consonantCnt $vowelCnt\n")
        consonantCnt = 0
        vowelCnt = 0
    }

    bw.flush()
    bw.close()

    br.close()
}