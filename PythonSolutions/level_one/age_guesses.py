def age_guess():
    day = 7
    print("Guess my birth day")
    guess = int(input())

    while True:
        if guess == day:
            print("Correct guess")
            break
        else:
            print("Incorrect Guess")
            print("Guess my birth day")
            guess = int(input())

if __name__ == '__main__':
    age_guess()
