
word = "Mississippi"
sCounter = 0
iCounter = 0

for (let i = 0; i <word.length ; i++) {
    if (word.charAt(i) == "s") sCounter++;
    else if (word.charAt(i) == "i") iCounter++;
}

console.log(sCounter)
console.log(iCounter)