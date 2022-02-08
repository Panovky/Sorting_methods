fun selectionSort(list: MutableList<Int>): MutableList<Int> {
    var buf: Int
    var smallest: Int

    for (i in 0..list.size-2) {

        smallest = i+1
        for (k in i+2..list.size-1) {
            if (list[k] < list[smallest]) {
                smallest = k
            }
        }

        if (list[smallest] < list[i]) {
            buf = list[i]
            list[i] = list[smallest]
            list[smallest] = buf
        }
    }

    return list
}

fun main() {
    var unsortedList = mutableListOf(-3, 10, 5, 5, -4, 100, 3, 3, 1, 10, 56, 101, 99)
    var sortedList = selectionSort(unsortedList)
    println(sortedList)
}

main()