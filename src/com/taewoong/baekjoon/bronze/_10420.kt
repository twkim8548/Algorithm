package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val cal = Calendar.getInstance()
    cal.time = SimpleDateFormat("yyyy-MM-dd").parse("2014-04-02")

    val df = SimpleDateFormat("yyyy-MM-dd")
    df.format(cal.time)

    val addDay = br.readLine().toInt()
    cal.add(Calendar.DATE, addDay - 1)
    bw.write(df.format(cal.time))

    bw.flush()
    bw.close()

    br.close()

}