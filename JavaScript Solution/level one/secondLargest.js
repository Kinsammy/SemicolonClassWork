var firstLargest = 0;
var secondLargest = 0;
var number = prompt("Enter a number or -1 to quit the program")
while (number != -1) {
    if (number > firstLargest) {
        secondLargest = firstLargest
        number = firstLargest
    }
    if (number < firstLargest) {
        if (number > secondLargest) {
            number = secondLargest
        }
    }
    var number = prompt("Enter a number or -1 to quit the program")
}
console.log("The Second largest is " + secondLargest)