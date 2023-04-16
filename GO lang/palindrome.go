package main

import "fmt"

func main() {
	
	var reverseNumber int
	
	fmt.Println("Enter 5 digits :")
	var number int 
	fmt.Scanf("%d", &number)
	var originalNumber = number
	
	for number > 0 {
		var rem = number % 10
		reverseNumber = reverseNumber * 10 + rem
		number =number / 10 
	}
	
	if reverseNumber == originalNumber {
		fmt.Printf("%d number is palindrome!", originalNumber)
	} else{
		fmt.Printf("%d number is not palindrome!", originalNumber)
	}


}
