import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.time.OffsetDateTime
import java.util.StringTokenizer
import kotlin.math.min

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val map = mutableMapOf<Int, String>()

    map[1995]= "ITMO"
    map[1996]= "SPbSU"
    map[1997]= "SPbSU"
    map[1998]= "ITMO"
    map[1999]= "ITMO"
    map[2000]= "SPbSU"
    map[2001]= "ITMO"
    map[2002]= "ITMO"
    map[2003]= "ITMO"
    map[2004]= "ITMO"
    map[2005]= "ITMO"
    map[2006]= "PetrSU, ITMO"
    map[2007]= "SPbSU"
    map[2008]= "SPbSU"
    map[2009]= "ITMO"
    map[2010]= "ITMO"
    map[2011]= "ITMO"
    map[2012]= "ITMO"
    map[2013]= "SPbSU"
    map[2014]= "ITMO"
    map[2015]= "ITMO"
    map[2016]= "ITMO"
    map[2017]= "ITMO"
    map[2018]= "SPbSU"
    map[2019]= "ITMO"

    bw.write("${map[br.readLine().toInt()]}")

    bw.flush()
    bw.close()
}