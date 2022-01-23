package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 1

    while (true) {
        var token = StringTokenizer(br.readLine())

        val o = token.nextToken().toInt()
        var w = token.nextToken().toInt()
        var isDie = false

        if (o == 0 && w == 0) {
            break
        }
//
//        while (true) {
//            token = StringTokenizer(br.readLine())
//
//            val x = token.nextToken()
//            val y = token.nextToken()
//
//            if (x == "E") {
//                w -= y.toInt()
//            } else if (x == "F") {
//                w += y.toInt()
//            } else {
//                break
//            }
//
//            if (w < 0) {
//                isDie = false
//            }
//        }
//        cnt++
//        bw.write("$cnt ")
//        if (isDie) {
//            bw.write("RIP\n")
//        } else {
//
//            if (w > (o / 2 + 1) && w < o * 2) {
//                bw.write(":-)\n")
//            } else {
//                bw.write(":-(\n")
//            }
//        }
//        bw.flush()

        while (true) {
            token = StringTokenizer(br.readLine())

            val x = token.nextToken()
            val y = token.nextToken()
            when (x) {
                "F" -> w += y.toInt()
                "E" -> w -= y.toInt()
                else -> break
            }

            if (w <= 0) {
                isDie = true
            }
        }
        println("${cnt++} " +
                if (isDie) "RIP"
                else {
                    if (w in (o / 2 + 1) until o * 2) ":-)"
                    else ":-("
                }
        )
    }
    bw.close()

    br.close()
}
