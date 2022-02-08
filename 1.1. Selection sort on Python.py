"""

Сортировка выбором (selection sort) наименьшего элемента.

1. Будем двигаться по массиву слева направо и на каждой итерации искать локальный минимум справа от текущего элемента.

2. Если найденный минимум будет меньше текущего элемента, поменяем их местами.

3. Повторяем данный алгоритм, пока не будет остортирован весь массив.

"""

def selection_sort(array):

    for i in range(len(array)-1):

        smallest = i+1
        for j in range(i+2, len(array)):
            if array[j] < array[smallest]:
                smallest = j

        if array[smallest] < array[i]:
            array[i], array[smallest] = array[smallest], array[i]

    print(array)

selection_sort([-3, 10, 5, 5, -4, 100, 3, 3, 1, 10, 56, 101, 99])
