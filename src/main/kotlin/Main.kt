fun main() {
    print(solution(100, 10, 910))
}

fun solution(upSpeed: Int, downSpeed: Int, desiredHeight: Int): Int {
    var currentHeight = 0
    var days = 0
    while (currentHeight < desiredHeight) {
        days++
        currentHeight += upSpeed
        if (currentHeight >= desiredHeight)
            return days
        currentHeight -= downSpeed
    }
    return days
}