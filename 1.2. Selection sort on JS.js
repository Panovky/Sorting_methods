"use strict";

function selectionSort(array) {
    let smallest;
    let buf;

    for (let i=0; i < array.length-1; i++) {

        smallest = i+1
        for (let k=i+2; k < array.length; k++) {
            if (array[k] < array[smallest]) {
                smallest = k
            }
        }

        if (array[smallest] < array[i]) {
            buf = array[i]
            array[i] = array[smallest]
            array[smallest] = buf
        }
    }
    return array
}

let unsortedArray = [-3, 10, 5, 5, -4, 100, 3, 3, 1, 10, 56, 101, 99]
let sortedArray = selectionSort(unsortedArray)
console.log(sortedArray)