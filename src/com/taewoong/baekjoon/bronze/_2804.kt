package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val a = token.nextToken()
    val b = token.nextToken()

    var aIdx = 0
    var bIdx = 0

    run loop@{
        a.forEachIndexed a@{ aIndex, a ->
            b.forEachIndexed { bIndex, b ->
                if (a == b) {
                    aIdx = aIndex
                    bIdx = bIndex
                    return@loop
                }
            }
        }
    }

    for (i in b.indices) {
        if (i == bIdx) {
            bw.write("$a\n")
        } else {
            for (j in a.indices) {
                if (j == aIdx) {
                    bw.write("${b[i]}")
                } else {
                    bw.write(".")
                }
                if (j == a.length - 1) {
                    bw.write("\n")
                }
            }
        }

    }

    bw.flush()
    bw.close()

    br.close()
}