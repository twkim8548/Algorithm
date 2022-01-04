package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.pow

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val string = br.readLine()
        if (string.equals("#")) break
        var answer = 0
        val array = string.toCharArray()
        array.reverse()
        array.forEachIndexed { index, c ->
            when (c.toString()) {
                "-" -> answer += 0 * "8".toDouble().pow(index.toDouble()).toInt()
                "\\" -> answer += 1 * "8".toDouble().pow(index.toDouble()).toInt()
                "(" -> answer += 2 * "8".toDouble().pow(index.toDouble()).toInt()
                "@" -> answer += 3 * "8".toDouble().pow(index.toDouble()).toInt()
                "?" -> answer += 4 * "8".toDouble().pow(index.toDouble()).toInt()
                ">" -> answer += 5 * "8".toDouble().pow(index.toDouble()).toInt()
                "&" -> answer += 6 * "8".toDouble().pow(index.toDouble()).toInt()
                "%" -> answer += 7 * "8".toDouble().pow(index.toDouble()).toInt()
                "/" -> answer += -1 * "8".toDouble().pow(index.toDouble()).toInt()
            }
        }
        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
