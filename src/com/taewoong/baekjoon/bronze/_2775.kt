package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val a = br.readLine().toInt()
        val b = br.readLine().toInt()

        var an = Array(b) { 1 }
        val bn = Array(b) { 0 }

        an.forEachIndexed { index, i ->
            if (index > 0) {
                an[index] = an[index - 1] + 1
            }
        }
        repeat(a) {
            bn.forEachIndexed { index, i ->
                if (index == 0) {
                    bn[index] = 1
                } else {
                    bn[index] = bn[index - 1] + an[index]
                }
            }
            an = bn
        }

        bw.write("${bn[bn.size - 1]}\n")
        bw.flush()
    }
    bw.close()
    br.close()
}
