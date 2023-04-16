package main

import "fmt"

func main() {
	var largest int 
	var larger int 
	

	fmt.Println("This program is used to determine two largest numbers among 10 numbers")
	fmt.Println("Enter 10 different numbers: ")
	for i := 1; i <= 10; i++ {
		fmt.Println("Number ",i)
		var number int
		fmt.Scanf("%d", &number)

		if number > largest {
			larger = largest 
			largest = number
		} else if number > larger { 
			larger = number
		}
	}

	fmt.Printf("The larger number is %d\n", larger)
	fmt.Printf("The largest number is %d\n", largest)
}

