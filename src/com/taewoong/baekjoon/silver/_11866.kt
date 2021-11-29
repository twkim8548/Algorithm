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

    bw.write("<")

    val token = StringTokenizer(br.readLine())
    val array = findJosephusList(token.nextToken().toInt(), token.nextToken().toInt())
    array.forEachIndexed { index, i ->
        bw.write("$i")
        if (index != array.lastIndex) {
            bw.write(", ")
        }
    }

    bw.write(">")
    bw.flush()
    bw.close()

    br.close()

}

fun findJosephusList(n: Int, k: Int): ArrayList<Int> {
    val arrivePeopleArray = (1..n).toMutableList()
    val diePeopleArray = ArrayList<Int>()

    var i = 1
    while (diePeopleArray.size < n) {
        if (i == k) {
            diePeopleArray.add(arrivePeopleArray[0])
            arrivePeopleArray.removeAt(0)
            i = 1
        } else {
            arrivePeopleArray.add(arrivePeopleArray[0])
            arrivePeopleArray.removeAt(0)
            i += 1
        }

    }

    return diePeopleArray
}
