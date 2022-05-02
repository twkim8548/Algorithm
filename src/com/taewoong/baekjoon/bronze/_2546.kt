package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val t = br.readLine().toInt()

    repeat(t) {
        br.readLine()
        var token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        val nArray = LongArray(n)
        val mArray = LongArray(m)

        token = StringTokenizer(br.readLine())

        repeat(n) {
            nArray[it] = token.nextToken().toLong()
        }

        token = StringTokenizer(br.readLine())
        repeat(m) {
            mArray[it] = token.nextToken().toLong()
        }

        var cnt = 0
        val nSum = nArray.sum()
        val mSum = mArray.sum()
        for (i in 0 until n) {
            if (nSum > nArray[i] * n && mSum < nArray[i] * m) {
                cnt++
            }
        }

        bw.write("${cnt}\n")
    }

    bw.flush()
    bw.close()
    br.close()
}
