fun insertionSort(list: MutableList<Int>): MutableList<Int> {
    var buf: Int

    for (i in 1..list.size-1) {
        buf = list[i]

        for (k in i-1 downTo 0 step 1) {

            if (list[k] > buf) {
                list[k+1] = list[k]
                list[k] = buf
            } else {
                break
            }
        }
    }

    return list
}

fun main() {
    var unsortedList = mutableListOf(-3, 10, 5, 5, -4, 100, 3, 3, 1, 10, 56, 101, 99)
    var sortedList = insertionSort(unsortedList)
    println(sortedList)
}

main()