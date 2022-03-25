package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.Math.abs
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val num = br.readLine().toInt()
        val token = StringTokenizer(br.readLine())

        val array = IntArray(num)
        var answer = 0

        repeat(num) {
            array[it] = token.nextToken().toInt()
        }
        array.sort()

        repeat(num -1) {
            answer += abs((array[it+1] - array[it]))
        }
        answer += abs(array[array.size - 1] - array[0])

        bw.write("$answer\n")

    }

    bw.flush()
    bw.close()
    br.close()

}
