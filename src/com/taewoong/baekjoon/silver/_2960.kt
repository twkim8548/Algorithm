package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())
    val n = token.nextToken().toInt()
    val k = token.nextToken().toInt()

    val array = IntArray(n)

    repeat(n) {
        array[it] = it + 1
    }

    var cnt = 0
    run {
        for (i in 1 until n) {
            if ((i + 1).toBigInteger().isProbablePrime(10)) {
                for (j in i until n step i + 1) {
                    if (array[j] != 0) {
                        cnt++
                        array[j] = 0
                        if (cnt == k) {
                            bw.write("${j + 1}")
                            return@run
                        }
                    }

                }
            }
        }
    }

    bw.flush()
    bw.close()

    br.close()


}
