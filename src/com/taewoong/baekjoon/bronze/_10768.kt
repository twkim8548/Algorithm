package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val year = br.readLine().toInt()
    val month = br.readLine().toInt()

    if (year == 2 && month == 18) {
        bw.write("Special")
    } else {
        if (year < 2) {
            bw.write("Before")
        } else if (year == 2) {
            if (month < 18) {
                bw.write("Before")
            } else {
                bw.write("After")
            }
        } else {
            bw.write("After")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}
