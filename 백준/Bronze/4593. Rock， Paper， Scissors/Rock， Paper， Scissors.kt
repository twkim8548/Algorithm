import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    while (true) {
        val player1 = br.readLine().replace(" ", "")
        val player2 = br.readLine().replace(" ", "")

        if (player1 == "E" && player2 == "E") {
            break
        }
        val player1Array = player1.toCharArray()
        val player2Array = player2.toCharArray()

        var player1WinCnt = 0
        var player2WinCnt = 0

        player1Array.forEachIndexed { index, c ->
            when (c) {
                'R' -> {
                    when (player2Array[index]) {
                        'S' -> {
                            player1WinCnt++
                        }

                        'P' -> {
                            player2WinCnt++
                        }
                    }

                }

                'S' -> {
                    when (player2Array[index]) {
                        'P' -> {
                            player1WinCnt++
                        }

                        'R' -> {
                            player2WinCnt++
                        }
                    }

                }

                'P' -> {
                    when (player2Array[index]) {
                        'R' -> {
                            player1WinCnt++
                        }

                        'S' -> {
                            player2WinCnt++
                        }
                    }

                }
            }
        }
        bw.write("P1: ${player1WinCnt}\n")
        bw.write("P2: ${player2WinCnt}\n")
    }

    bw.flush()
    bw.close()
}
