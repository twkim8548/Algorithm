package com.taewoong.baekjoon.silver

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var map = mutableMapOf<String, Long>()
    repeat(br.readLine().toInt()) {
        val token = StringTokenizer(br.readLine())
        val df = SimpleDateFormat("yyyy.MM.dd")
        val name = token.nextToken()
        val day = token.nextToken()
        val month = token.nextToken()
        val year = token.nextToken()

        map[name] = df.parse(year + "." + month + "." + day).time
    }

    map = map.toList().sortedBy { it.second }.toMap().toMutableMap()

    bw.write("${map.toList()[map.size-1].first}\n${map.toList()[0].first}")

    bw.flush()
    bw.close()
    br.close()
}