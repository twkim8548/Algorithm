import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = Array(5) { mutableMapOf<Int, Boolean>() }

    repeat(5) { col ->
        val token = StringTokenizer(br.readLine())
        repeat(5) {
            map[col][token.nextToken().toInt()] = false
        }
    }

    var cnt = 0
    run repeatBlock@{
        repeat(5) {
            val token = StringTokenizer(br.readLine())
            repeat(5) {
                cnt++
                val num = token.nextToken().toInt()
                map.forEach {
                    if (it[num] == false) {
                        it[num] = true
                    }
                }
                if (findBingo(map)) {
                    return@repeatBlock
                }
            }
        }
    }

    bw.write("$cnt")

    bw.flush()
    br.close()
}

fun findBingo(map: Array<MutableMap<Int, Boolean>>): Boolean {
    var cnt = 0
    map.forEach { it ->
        if (it.count { it.value } == 5) {
            cnt++
        }
    }

    repeat(5) {
        if (map[0].toList()[it].second && map[1].toList()[it].second && map[2].toList()[it].second && map[3].toList()[it].second && map[4].toList()[it].second) {
            cnt++
        }
    }

    if (map[0].toList()[0].second && map[1].toList()[1].second && map[2].toList()[2].second && map[3].toList()[3].second && map[4].toList()[4].second) {
        cnt++
    }

    if (map[4].toList()[0].second && map[3].toList()[1].second && map[2].toList()[2].second && map[1].toList()[3].second && map[0].toList()[4].second) {
        cnt++
    }

    if (cnt >= 3) {
        return true
    }
    return false

}
