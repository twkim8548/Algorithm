package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val name = br.readLine()
    var map = mutableMapOf<String, Int>()
    repeat(br.readLine().toInt()) {
        val teamName = br.readLine()

        val l = name.count { it == 'L' } + teamName.count { it == 'L' }
        val o = name.count { it == 'O' } + teamName.count { it == 'O' }
        val v = name.count { it == 'V' } + teamName.count { it == 'V' }
        val e = name.count { it == 'E' } + teamName.count { it == 'E' }

        val percentage = ((l + o) * (l + v) * (l + e) * (o + v) * (o + e) * (v + e)) % 100
        map[teamName] = percentage
    }

    map = map.toSortedMap()

    map = map.toList().sortedByDescending { it.second }.toMap().toMutableMap()

    bw.write(map.toList()[0].first)
    bw.flush()
    bw.close()

    br.close()
}