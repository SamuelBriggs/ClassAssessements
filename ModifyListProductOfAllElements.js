function modifyListProductOfAllElements(list){
    newArr = []
    for (let i = 0; i < list.length ; i++) {
       let product = 1;
       console.log(product)
        for (let j = 0; j < list.length ; j++) {
            if (list[j] != list[i]) product *= list[j]
        }
        console.log(product)
        newArr.push(product)
    }
    return newArr;
}

console.log(modifyListProductOfAllElements([4,2,1,5,0]))