function binaryToDecimal(binary){
    let multiplier = 2
    let remainder = binary
    let addition = 0
    while (remainder!=0){
        modulo = remainder % 10
        console.log(modulo)
        multiplier +=2
        remainder = remainder / 10
        console.log(remainder)
    }
    console.log(remainder)

}

binaryToDecimal(1102)