package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0
    while (true) {
        val num = br.readLine().toInt()
        if (num == 0) {
            break
        }
        cnt++
        var answer = 0
        repeat(num) {
            val token = StringTokenizer(br.readLine())
            val array = IntArray(it + 1)
            for (i in 0 until it + 1) {
                array[i] = token.nextToken().toInt()
            }

            if (it == num - 1) {
                answer += array.sum()
            } else {
                answer += array[0]
                if (it != 0) {
                    answer += array[array.size - 1]
                }
            }
        }

        bw.write("Case #$cnt:$answer\n")
    }
    bw.flush()
    bw.close()
    br.close()
}
