package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val temp = br.readLine()

        val doughToken = StringTokenizer(br.readLine())
        val toppingToken = StringTokenizer(br.readLine())

        val doughMaterial = IntArray(5)
        val topping = IntArray(4)


        doughMaterial[0] = doughToken.nextToken().toInt() * 16 / 8
        doughMaterial[1] = doughToken.nextToken().toInt() * 16 / 8
        doughMaterial[2] = doughToken.nextToken().toInt() * 16 / 4
        doughMaterial[3] = doughToken.nextToken().toInt() * 16
        doughMaterial[4] = doughToken.nextToken().toInt() * 16 / 9

        topping[0] = toppingToken.nextToken().toInt()
        topping[1] = toppingToken.nextToken().toInt() / 30
        topping[2] = toppingToken.nextToken().toInt() / 25
        topping[3] = toppingToken.nextToken().toInt() / 10

        val dough = doughMaterial.min()!!

        bw.write("${Math.min(dough, topping.sum())}\n")
    }

    bw.flush()
    bw.close()
    br.close()

}
