let day = 7;

var guessNumber = prompt("Guess my day of my birthday ")

while (true) {
    if (guessNumber == day) {
        console.log("Correct Guess")
        break
    } else {
        console.log("Incorrect Guess")
    }
}