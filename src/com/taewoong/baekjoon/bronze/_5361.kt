package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())

        var totalMoney = (token.nextToken().toBigDecimal() * "350.34".toBigDecimal())
        totalMoney += token.nextToken().toBigDecimal() * "230.90".toBigDecimal()
        totalMoney += token.nextToken().toBigDecimal() * "190.55".toBigDecimal()
        totalMoney += token.nextToken().toBigDecimal() * "125.30".toBigDecimal()
        totalMoney += token.nextToken().toBigDecimal() * "180.90".toBigDecimal()
        bw.write("\$${(totalMoney)}\n")
    }


    bw.flush()
    bw.close()

    br.close()
}
