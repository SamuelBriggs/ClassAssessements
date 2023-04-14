day = 14
guess = 0

while guess != day:
    guess = int(input("Enter a Guess: "))
    if guess != day: print("Incorrect Guess")

else: print("Correct guess")