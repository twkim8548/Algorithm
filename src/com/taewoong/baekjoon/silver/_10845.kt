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

    val array = ArrayList<Int>()

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        when (token.nextToken()) {
            "push" -> {
                array.add(token.nextToken().toInt())
            }
            "pop" -> {
                if (array.isNotEmpty()) {
                    bw.write("${array.first()}\n")
                    array.removeAt(0)
                } else {
                    bw.write("-1\n")
                }
            }
            "size" -> {
                bw.write("${array.size}\n")
            }
            "empty" -> {
                bw.write(if (array.isEmpty()) "1\n" else "0\n")
            }
            "front" -> {
                bw.write(if (array.isEmpty()) "-1\n" else "${array.first()}\n")
            }
            "back" -> {
                bw.write(if (array.isEmpty()) "-1\n" else "${array.last()}\n")
            }
        }
    }

    bw.flush()
    bw.close()
    br.close()
}
