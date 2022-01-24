package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken()
    val b = token.nextToken()

    var aSum = "0".toBigInteger()
    var bSum = "0".toBigInteger()

    a.forEach { aChar ->
        aSum += aChar.toString().toBigInteger()
    }

    b.forEach { bChar ->
        bSum += bChar.toString().toBigInteger()
    }

    val answer = aSum * bSum

    bw.write("$answer")
    bw.flush()
    bw.close()

    br.close()

}
