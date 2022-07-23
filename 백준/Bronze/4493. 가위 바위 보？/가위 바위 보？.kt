import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        var player1Cnt = 0
        var player2Cnt = 0
        repeat(br.readLine().toInt()) {
            val token = StringTokenizer(br.readLine())
            val player1 = token.nextToken()
            val player2 = token.nextToken()

            if (findWinner(player1, player2) == "Player1") player1Cnt++
            else if (findWinner(player1, player2) == "Player2") player2Cnt++
        }
        if (player1Cnt > player2Cnt) bw.write("Player 1\n")
        else if (player1Cnt < player2Cnt) bw.write("Player 2\n")
        else bw.write("TIE\n")
    }

    bw.flush()
    bw.close()

    br.close()
}

fun findWinner(player1: String, player2: String): String {
    var winner = ""
    if (player1 == "R") {
        when (player2) {
            "R" -> winner = "TIE"
            "S" -> winner = "Player1"
            "P" -> winner = "Player2"
        }
    }
    if (player1 == "S") {
        when (player2) {
            "R" -> winner = "Player2"
            "S" -> winner = "TIE"
            "P" -> winner = "Player1"
        }
    }
    if (player1 == "P") {
        when (player2) {
            "R" -> winner = "Player1"
            "S" -> winner = "Player2"
            "P" -> winner = "TIE"
        }
    }
    return winner
}
