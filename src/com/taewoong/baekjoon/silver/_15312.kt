package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val a = br.readLine()
    val b = br.readLine()
    val answerArray = mutableListOf<Int>()
    val cntArray = arrayOf(3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1)
    var name = ""

    for (i in a.indices) {
        name += a[i].toString()
        name += b[i].toString()
    }

    for (i in 0 until name.length - 1) {
        answerArray.add(cntArray[name[i].toInt() - 65] + cntArray[name[i + 1].toInt() - 65])
    }

    var cnt = name.length - 1
    repeat(name.length - 3) {
        for (i in 0 until cnt - 1) {
            val num = (answerArray[i] + answerArray[i + 1])
            if (num >= 10) {
                answerArray[i] =(num % 10)
            } else {
                answerArray[i] = num
            }
        }
        cnt--
    }
    bw.write("${answerArray[0]}${answerArray[1]}")
    bw.flush()
    bw.close()

    br.close()
}
