import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var red = 0
    var blue = 0

    val array = mutableListOf<Kartrider>()
    repeat(8) {
        val token = StringTokenizer(br.readLine())
        val time = token.nextToken().split(":")
        val timeToInteger =
            (time[0].toInt() * 60 * 1000) + (time[1].toInt() * 1000) + time[2].toInt()

        array.add(Kartrider(timeToInteger, token.nextToken(), it))
    }
    array.sortBy { it.time }
    array.forEachIndexed { index, kartrider ->
        kartrider.rank = index
    }
    array.forEach {
        if (it.team == "B") {
            blue += getScore(it.rank)
        } else {
            red += getScore(it.rank)
        }
    }
    if (blue == red) {
        if (array[0].team == "B") {
            bw.write("Blue")
        } else {
            bw.write("Red")
        }
    } else if (blue > red) {
        bw.write("Blue")
    } else {
        bw.write("Red")
    }
    bw.flush()
    bw.close()
}

fun getScore(rank: Int): Int {
    when (rank) {
        0 -> {
            return 10
        }

        1 -> {
            return 8
        }

        2 -> {
            return 6
        }

        3 -> {
            return 5
        }

        4 -> {
            return 4
        }

        5 -> {
            return 3
        }

        6 -> {
            return 2
        }

        7 -> {
            return 1
        }

        else -> return 0
    }
}

data class Kartrider(
    val time: Int,
    val team: String,
    var rank: Int,
)