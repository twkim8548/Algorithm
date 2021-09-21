package com.taewoong.baekjoon.bronze

import java.io.BufferedWriter
import java.io.OutputStreamWriter

fun main() {
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    bw.write("     /~\\\n" +
            "    ( oo|\n" +
            "    _\\=/_\n" +
            "   /  _  \\\n" +
            "  //|/.\\|\\\\\n" +
            " ||  \\ /  ||\n" +
            "============\n" +
            "|          |\n" +
            "|          |\n" +
            "|          |")
    bw.flush()
    bw.close()
}
