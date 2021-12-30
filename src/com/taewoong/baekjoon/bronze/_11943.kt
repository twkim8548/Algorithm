package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val aToken = StringTokenizer(br.readLine())
    val bToken = StringTokenizer(br.readLine())

    val aApple = aToken.nextToken().toInt()
    val aOrange = aToken.nextToken().toInt()

    val bApple = bToken.nextToken().toInt()
    val bOrange = bToken.nextToken().toInt()


    bw.write(
        "${
            Math.min(aApple + bOrange , bApple + aOrange
            )
        }"
    )

    bw.flush()
    bw.close()

    br.close()
}
