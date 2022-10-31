import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val ml = token.nextToken()
    val mr = token.nextToken()
    val tl = token.nextToken()
    val tr = token.nextToken()

    bw.write("${findWinner(ml, mr, tl, tr)}")

    bw.flush()
    bw.close()
}

fun findWinner(ml: String, mr: String, tl: String, tr:String): String {
    if (ml == mr) {
        if (ml == "R") {
            if (tl == "P" || tr == "P") {
                return("TK")
            }
        } else if (ml == "S") {
            if (tl == "R" || tr == "R") {
                return("TK")
            }
        } else if (ml == "P") {
            if (tl == "S" || tr == "S") {
                return("TK")
            }
        }
    }

    if (tl == tr) {
        if (tl == "R") {
            if (ml == "P" || mr == "P") {
                return("MS")
            }
        } else if (tl == "S") {
            if (ml == "R" || mr == "R") {
                return("MS")
            }
        } else if (tl == "P") {
            if (ml == "S" || mr == "S") {
                return("MS")
            }
        }
    }

    return("?")
}
