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
            "push" -> {
                array.add(token.nextToken().toInt())
            }
            "top" -> {
                if (array.isEmpty())
                    bw.write("-1\n")
                else
                    bw.write("${array[array.lastIndex]}\n")

            }
            "size" -> {
                bw.write("${array.size}\n")
            }
            "empty" -> {
                if (array.isEmpty())
                    bw.write("1\n")
                else
                    bw.write("0\n")
            }
            "pop" -> {
                if (array.isEmpty())
                    bw.write("-1\n")
                else {
                    bw.write("${array[array.lastIndex]}\n")
                    array.removeAt(array.lastIndex)
                }
            }
        }
    }
    bw.flush()
    bw.close()
    br.close()
}
