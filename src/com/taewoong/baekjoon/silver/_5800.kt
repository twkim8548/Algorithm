package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) { cnt ->
        val token = StringTokenizer(br.readLine())
        val intArray = IntArray(token.nextToken().toInt())

        for (i in 0 until intArray.size) {
            intArray[i] = token.nextToken().toInt()
        }

        var largestGap = 0
        intArray.sort()
        intArray.forEachIndexed { index, i ->
            if (index > 0 && index < intArray.size) {
                if (i - intArray[index - 1] > largestGap) {
                    largestGap = i - intArray[index - 1]
                }
            }
        }

        bw.write("Class ${cnt + 1}\nMax ${intArray.maxOrNull()}, Min ${intArray.minOrNull()}, Largest gap $largestGap\n")
    }

    bw.flush()
    bw.close()

    br.close()

}