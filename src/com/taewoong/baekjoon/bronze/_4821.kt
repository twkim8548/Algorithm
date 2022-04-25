package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val page = br.readLine().toInt()
        if (page == 0) {
            break
        }

        val array = BooleanArray(page)

        val printingNumber = br.readLine().split(",")
        printingNumber.forEach {
            if (it.contains('-')) {
                val start = it.split("-")[0].toInt()
                val end = it.split("-")[1].toInt()
                if (start <= end && start <= page) {
                    if (end <= page) {
                        for (i in start..end) {
                            array[i - 1] = true
                        }
                    } else {
                        for (i in start..page) {
                            array[i - 1] = true
                        }
                    }
                }
            } else if (it.toInt() <= page) {
                array[it.toInt() - 1] = true
            }
        }

        var answer = 0
        array.forEach {
            if (it) {
                answer++
            }
        }

        bw.write("$answer\n")
    }

    bw.flush()
    bw.close()

    br.close()
}
