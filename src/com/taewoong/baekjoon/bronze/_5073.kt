package com.taewoong.baekjoon.bronze

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

        val array = IntArray(3)
        array[0] = token.nextToken().toInt()
        array[1] = token.nextToken().toInt()
        array[2] = token.nextToken().toInt()

        array.sort()

        if (array[0] == 0 && array[1] == 0 && array[2] == 0) {
            break
        }


        if (array[2] >= array[0] + array[1]) {
            bw.write("Invalid\n")
        } else {
            if (array[0] == array[1] && array[1] == array[2]) {
                bw.write("Equilateral\n")
            } else if (array[0] == array[1] || array[0] == array[2] || array[1] == array[2]) {
                bw.write("Isosceles\n")
            } else {
                bw.write("Scalene\n")
            }
        }
    }
    bw.flush()
    bw.close()

    br.close()
}
