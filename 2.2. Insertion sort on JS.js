"use strict";

function insertionSort(array) {
    let buf;

    for (let i = 1; i < array.length; i++) {

        buf = array[i];
        for (let k = i - 1; k >=0; k--) {

            if (array[k] > buf) {
                array[k+1] = array[k];
                array[k] = buf;
            } else {
                break;
            }
        }
    }
    return array;
}

let unsortedArray = [-3, 10, 5, 5, -4, 100, 3, 3, 1, 10, 56, 101, 99];
let sortedArray = insertionSort(unsortedArray);
console.log(sortedArray);