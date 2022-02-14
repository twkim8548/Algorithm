package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())

    val n = token.nextToken().toInt()
    val m = token.nextToken().toInt()

    token = StringTokenizer(br.readLine())
    val boxes = IntArray(n)

    repeat(n) {
        boxes[it] = token.nextToken().toInt()
    }

    token = StringTokenizer(br.readLine())
    val books = IntArray(m)

    repeat(m) {
        books[it] = token.nextToken().toInt()
    }

    box@ for (j in boxes.indices) {
        var boxVolume = boxes[j]
        book@ for (i in books.indices) {
            if (boxVolume <= 0) {
                continue@box
            }
            if (books[i] <= 0 || boxVolume < books[i]) {
                continue@book
            }
            boxVolume -= books[i]
            boxes[j] = boxes[j] - books[i]
            books[i] = 0
        }
    }

    bw.write("${boxes.sum()}")
    bw.flush()
    bw.close()

    br.close()

}
