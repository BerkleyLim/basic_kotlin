// 구구단 로직 짜기
fun solution() {
    // 구구단 2~5
    for (x: Int in 1..9) {
        for (y: Int in 2..5) {
            if (x %4 == 0) {
                continue
            } else {
                print("$y * $x = ${x*y} \t")
            }
        }
        println()
    }

    println()
    println()

    // 구구단 6~9
    for (x: Int in 1..9) {
        for (y: Int in 6..9) {
            if (x %4 == 0) {
                continue
            } else {
                print("$y * $x = ${x*y} \t")
            }
        }
        println()
    }
}