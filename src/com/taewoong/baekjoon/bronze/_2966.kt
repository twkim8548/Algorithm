package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    val answer = br.readLine().toCharArray()

    var adrianCnt = 0 // abc abc
    var brunoCnt = 0 // babc babc
    var goranCnt = 0 // ccaabb ccaabb

    var adrianAnswer = arrayOf("A", "B", "C")
    var brunoAnswer = arrayOf("B", "A", "B", "C")
    var goranAnswer = arrayOf("C", "C", "A", "A", "B", "B")

    answer.forEachIndexed { index, c ->
        if (c.toString() == adrianAnswer[index % 3]) {
            adrianCnt++
        }
        if (c.toString() == brunoAnswer[index % 4]) {
            brunoCnt++
        }
        if (c.toString() == goranAnswer[index % 6]) {
            goranCnt++
        }
    }

    val cntArray = arrayOf(adrianCnt, brunoCnt, goranCnt)
    bw.write("${cntArray.max()}\n")

    if (adrianCnt == cntArray.max()) {
        bw.write("Adrian\n")
    }
    if (brunoCnt == cntArray.max()) {
        bw.write("Bruno\n")
    }
    if (goranCnt == cntArray.max()) {
        bw.write("Goran\n")
    }


    bw.flush()
    bw.close()
}
