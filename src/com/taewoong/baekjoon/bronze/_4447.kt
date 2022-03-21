package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var gCnt = 0
        var bCnt = 0

        val name = br.readLine()
        name.toLowerCase().forEach {
            if (it.toString() == "g") {
                gCnt++
            }
            if (it.toString() == "b") {
                bCnt++
            }
        }

        if (gCnt > bCnt) {
            bw.write("$name is GOOD\n")
        } else if (gCnt < bCnt) {
            bw.write("$name is A BADDY\n")
        } else {
            bw.write("$name is NEUTRAL\n")
        }
    }

    bw.flush()
    bw.close()

    br.close()
}
