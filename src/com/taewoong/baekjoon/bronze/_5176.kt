package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val p = token.nextToken().toInt()
        val m = token.nextToken().toInt()

        val array = BooleanArray(m)
        var answer = 0
        repeat(p) {
            val seat = br.readLine().toInt() - 1
            if (seat - 1 <= m) {
                if (array[seat]) {
                    answer++
                } else {
                    array[seat] = true
                }
            }
        }

        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
