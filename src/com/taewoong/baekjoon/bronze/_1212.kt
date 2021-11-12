package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.math.BigInteger

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))


    bw.write(getBinary(br.readLine().toBigInteger(8)))
    bw.flush()
    bw.close()

    br.close()
}

fun getBinary(octal: BigInteger) : String{
    return octal.toString(2)
}
