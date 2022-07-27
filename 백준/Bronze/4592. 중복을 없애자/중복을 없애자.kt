package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val token = StringTokenizer(br.readLine())
        val n = token.nextToken().toInt()
        if (n == 0) {
            break
        }

        val array = ArrayList<Int>()
        repeat(n) {
            array.add(token.nextToken().toInt())
        }

        var cnt = n
        var i = 0
        while (true) {
            if (array.size == 1) {
                break
            }
            if (array[i] == array[i + 1]) {
                array.removeAt(i + 1)
                cnt--
                i--
            }
            if (cnt - 2 == i) break
            if (cnt > i) i++
        }

        array.forEach {
            bw.write("$it ")
        }
        bw.write("$\n")
    }

    bw.flush()
    bw.close()

    br.close()
}