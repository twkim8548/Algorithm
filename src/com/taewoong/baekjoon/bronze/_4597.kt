package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        var string = br.readLine()

        if (string == "#") {
            break
        }

        var cnt = 0
        string.forEach {
            if (it.toString() == "1") {
                cnt++
            }
        }
        if (string.contains('e')) {
            if (cnt % 2 == 0) {
                string = string.replace('e', '0')
            } else {
                string = string.replace('e', '1')
            }
        } else {
            if (cnt % 2 == 0) {
                string = string.replace('o', '1')
            } else {
                string = string.replace('o', '0')
            }
        }

        bw.write("$string\n")
    }
    bw.flush()
    bw.close()

    br.close()

}