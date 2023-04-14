var word = "Mississippi";
let iCount = 0;
let sCount = 0;
for (var index = 0; index < word.length; index++){
    if (word.charAt(index) == 'i') {
        iCount++;
    }
    if (word.charAt(index) == 's') {
        sCount++;
    }
}

console.log("Letter i occur " + iCount)
console.log("Letter s occur " +sCount)