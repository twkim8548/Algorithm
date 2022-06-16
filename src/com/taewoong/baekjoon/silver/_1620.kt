package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()
    val array = Array<String>(n) {br.readLine()}

    repeat(m) {
        val question = br.readLine()
        if (chkNum(question)) {
            bw.write("${array[question.toInt() - 1]}\n")
        } else {
            bw.write("${array.indexOf(question) + 1}\n")

        }
    }

    bw.flush()
    bw.close()

    br.close()
}

fun chkNum(str: String) : Boolean {
    var temp: Char

    var result = true

    for (i in 0 until str.length) {
        temp = str.elementAt(i)
        if (temp.toInt() < 48 || temp.toInt() > 57) {
            result = false
        }
    }

    return result
}