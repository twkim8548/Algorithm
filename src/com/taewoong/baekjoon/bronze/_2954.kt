package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = br.readLine().split(" ")
    val answer = ArrayList<String>()

    var cnt = 0

    array.forEachIndexed { i, s ->
        s.forEachIndexed { j, it ->
            if (cnt == 0 || cnt == 3) {
                cnt = 0
                if (answer.size < i+1) {
                    answer.add(it.toString())
                } else {
                    answer[i] += it.toString()
                }
                if (it == 'a' || it == 'e' || it == 'i' || it == 'o' || it == 'u') {
                    cnt++
                }
            } else {
                cnt++
            }
        }
    }
    answer.forEach {
        bw.write("$it ")
    }

    bw.flush()
    bw.close()
    br.close()
}