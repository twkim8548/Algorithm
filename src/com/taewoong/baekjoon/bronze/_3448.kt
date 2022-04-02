package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var string = br.readLine()
        while (true) {
            val temp = br.readLine()
            if (temp == "") {
                break
            }
            string += temp
        }

        var cnt = 0.0

        string.forEach {
            if (it.toString() == "#") {
                cnt++
            }
        }
        val answer = String.format("%.1f", ((string.length - cnt) / string.length * 100))

        if (answer.split(".")[1] == "0") {
            bw.write("Efficiency ratio is ${answer.toDouble().toInt()}%.\n")
        } else {
            bw.write("Efficiency ratio is $answer%.\n")
        }


    }
    bw.flush()
    bw.close()

    br.close()
}
