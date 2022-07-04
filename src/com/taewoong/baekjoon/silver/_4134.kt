package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var n = br.readLine().toBigInteger()

        if (n.isProbablePrime(10)) {
            bw.write("$n\n")
        } else {
            bw.write("${n.nextProbablePrime()}\n")
        }
    }

    bw.flush()
    bw.close()
    br.close()
}

