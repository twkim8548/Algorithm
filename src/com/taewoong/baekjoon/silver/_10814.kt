package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val array = arrayListOf<Human>()

    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        array.add(Human(token.nextToken().toInt(), token.nextToken()))
    }

    array.sortBy { it.age }

    array.forEach {
        bw.write("${it.age} ${it.name}\n")
    }

    bw.flush()
    bw.close()

    br.close()
}

data class Human(var age:Int, var name: String)
