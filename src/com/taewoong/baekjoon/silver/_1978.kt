package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val n = br.readLine().toInt()
    var answer = 0

    val token = StringTokenizer(br.readLine())
    repeat(n) {
        if (isPrime(token.nextToken().toInt())) answer += 1
    }

    bw.write("$answer")
    bw.flush()
    bw.close()
    br.close()
}

fun isPrime(num: Int): Boolean {
    if (num < 2) return false
    for (i in 2 until num)
        if (num % i == 0) {
            return false
        }
    return true
}
