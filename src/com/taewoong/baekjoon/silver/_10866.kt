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
        when (token.nextToken().toString()) {
            "push_front" -> {
                array.add(0, token.nextToken().toInt())
            }
            "push_back" -> {
                array.add(token.nextToken().toInt())
            }
            "pop_front" -> {
                if (array.size > 0) {
                    bw.write("${array[0]}\n")
                    array.removeAt(0)
                } else {
                    bw.write("-1\n")
                }
            }
            "pop_back" -> {
                if (array.size > 0) {
                    bw.write("${array[array.lastIndex]}\n")
                    array.removeAt(array.lastIndex)
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
                if (array.size > 0) {
                    bw.write("${array[0]}\n")
                } else {
                    bw.write("-1\n")
                }
            }
            "back" -> {
                if (array.size > 0) {
                    bw.write("${array[array.lastIndex]}\n")
                } else {
                    bw.write("-1\n")
                }
            }
        }
    }
    bw.flush()
    bw.close()

    br.close()
}

