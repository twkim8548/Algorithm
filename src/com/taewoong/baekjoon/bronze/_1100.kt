package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var count = 0
    repeat(8) { row ->
        if (row % 2 == 1) {
            var array = br.readLine().split("")
            array.forEachIndexed { index, s ->
                if (!(index == 0 || index == array.size - 1)) {
                    if (index % 2 == 0 && s == "F") {
                        count++
                    }
                }
            }
        } else {
            val array = br.readLine().split("")
            array.forEachIndexed { index, s ->
                if (!(index == 0 || index == array.size - 1)) {
                    if (index % 2 == 1 && s == "F") {
                        count++
                    }
                }
            }
        }
    }

    bw.write("$count")
    bw.flush()
    bw.close()
    br.close()
}