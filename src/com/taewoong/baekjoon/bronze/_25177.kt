package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    val nowArray = IntArray(n)
    val pastArray = IntArray(m)

    token = StringTokenizer(br.readLine())
    repeat(n) {
        nowArray[it] = token.nextToken().toInt()
    }

    token = StringTokenizer(br.readLine())
    repeat(m) {
        pastArray[it] = token.nextToken().toInt()
    }

    var max = 0
    if (n >= m) {
        pastArray.forEachIndexed { index, i ->
            if (i - nowArray[index] > max) {
                max = i - nowArray[index]
            }
        }
    } else {
        nowArray.forEachIndexed { index, i ->
            if (pastArray[index] - i > max) {
                max = pastArray[index] - i
            }
        }
        for (i in n until m) {
            if (pastArray[i] > max) {
                max = pastArray[i]
            }
        }
    }

    bw.write("$max")
    bw.flush()
    bw.close()

    br.close()
}
