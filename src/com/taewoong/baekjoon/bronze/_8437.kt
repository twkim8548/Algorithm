package com.taewoong.baekjoon.bronze

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    
    val sum = br.readLine().toInt()
    val difference = br.readLine().toInt() 
    
    bw.write("${(sum + difference) / 2}\n")
    bw.write("${(sum - difference) / 2}\n")
    
    bw.flush()
    bw.close()
    
    br.close()
}
