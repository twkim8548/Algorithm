package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = Array(5) { "" }
    val answer = Array(5) { "" }
    repeat(5) {
        array[it] = br.readLine()
    }


    for (i in 0 until array[0].length) {
        var a = ""
        repeat(5) {
            a += array[it][i]
        }
        if (a == ".omln") {
            answer[0] += "o"
            answer[1] += "w"
            answer[2] += "l"
            answer[3] += "n"
            answer[4] += "."
        } else if (a == "owln.") {
            answer[0] += "."
            answer[1] += "o"
            answer[2] += "m"
            answer[3] += "l"
            answer[4] += "n"
        } else if (a == "..oLn") {
            answer[0] += "."
            answer[1] += "."
            answer[2] += "o"
            answer[3] += "L"
            answer[4] += "n"
        }
    }

    answer.forEachIndexed { index, s ->
        if (index < 4) {
        bw.write("$s\n")
        } else {
            bw.write("$s")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
