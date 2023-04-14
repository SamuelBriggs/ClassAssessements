function rotateArrayOnce(array){
    temp = array.length
    for (let i = array.length -1; i > 0; i--) {
        array[i] = array[i-1]
    }
    array[0] = temp
    return array
}
console.log(rotateArrayOnce([1,2,3,4,5]))