print("Enter a Number or -1 to stop")

newList= []
secondLargest = 0;
userInput = int(input("Enter a Number"))
while userInput != -1:
   newList.append(userInput)
   userInput = int(input("Enter a Number: "))


newList.sort()
secondLargest = newList[len(newList) - 2]
print(secondLargest)
