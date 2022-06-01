package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0

    val reverseN = factorial(br.readLine().toBigInteger()).toString().reversed()
    for (i in reverseN.indices) {
        if (reverseN[i] == '0') {
            cnt++
        } else {
            break
        }
    }

    bw.write("$cnt")
    bw.flush()
    bw.close()
}

fun factorial(n: BigInteger): BigInteger {
    if (n == BigInteger.ONE || n == BigInteger.ZERO) {
        return BigInteger.ONE
    } else {
        return (n * factorial(n - BigInteger.ONE))
    }
}