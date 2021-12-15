package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = getToken(br.readLine())

    val bornArray = IntArray(3)

    for (i in bornArray.indices) {
        bornArray[i] = token.nextToken().toInt()
    }

    token = getToken(br.readLine())
    val standardArray = IntArray(3)

    for (i in standardArray.indices) {
        standardArray[i] = token.nextToken().toInt()
    }

    var americanAge = 0
    var age = 1
    var yearAge = 0
    if (standardArray[0] - bornArray[0] > 0) {
        age += standardArray[0] - bornArray[0]
        yearAge += standardArray[0] - bornArray[0]
        if (standardArray[1] - bornArray[1] == 0) {
            if (standardArray[2] - bornArray[2] >= 0) {
                americanAge += standardArray[0] - bornArray[0]
            } else {
                americanAge += standardArray[0] - bornArray[0] - 1
            }
        } else if (standardArray[1] - bornArray[1] > 0) {
            americanAge += standardArray[0] - bornArray[0]
        } else {
            americanAge += standardArray[0] - bornArray[0] - 1
        }
    }
    bw.write("$americanAge\n$age\n$yearAge")
    bw.flush()
    bw.close()

    br.close()

}

fun getToken(string: String): StringTokenizer {
    return StringTokenizer(string)
}
