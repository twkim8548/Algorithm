package com.taewoong.baekjoon.implementation

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    /*
    양의 정수 n이 주어졌을 때, 이를 이진수로 나타냈을 때 1의 위치를 모두 찾는 프로그램을 작성하시오. 최하위 비트(least significant bit, lsb)의 위치는 0이다.
     */

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val number = br.readLine().toInt()
        val numberToRadix = number.toString(2)

        val numberArray = numberToRadix.toCharArray()
        numberArray.reverse()

        for (i in numberArray.indices) {
            if (numberArray[i] == '1') {
                bw.write("$i ")

            }
        }

        bw.write("\n")

    }

    bw.flush()
    bw.close()
    br.close()
}
