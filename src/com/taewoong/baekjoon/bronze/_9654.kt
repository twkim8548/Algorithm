package com.taewoong.baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    bw.write("SHIP NAME      CLASS          DEPLOYMENT IN SERVICE\n" +
            "N2 Bomber      Heavy Fighter  Limited    21        \n" +
            "J-Type 327     Light Combat   Unlimited  1         \n" +
            "NX Cruiser     Medium Fighter Limited    18        \n" +
            "N1 Starfighter Medium Fighter Unlimited  25        \n" +
            "Royal Cruiser  Light Combat   Limited    4         ")

    bw.flush()
    bw.close()
}
