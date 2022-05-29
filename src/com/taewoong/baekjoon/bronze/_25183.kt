package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()

    val array = br.readLine().toCharArray()

    var isAdjacentCnt = 1

    for (i in 0 until n - 1) {
        if (array[i] == 'A') {
            if (array[i + 1] == 'B') {
                isAdjacentCnt++
            } else {
                isAdjacentCnt = 1
            }
        } else if (array[i] == 'Z') {
            if (array[i + 1] == 'Y') {
                isAdjacentCnt++
            } else {
                isAdjacentCnt = 1
            }
        } else {
            if (array[i] + 1 == array[i + 1] || array[i] - 1 == array[i + 1]) {
                isAdjacentCnt++
            } else {
                isAdjacentCnt = 1
            }
        }
        if (isAdjacentCnt == 5) {
            bw.write("YES")
            break
        }
    }
    if (isAdjacentCnt < 5) {
        bw.write("NO")
    }

    bw.flush()
    bw.close()
    br.close()

}
