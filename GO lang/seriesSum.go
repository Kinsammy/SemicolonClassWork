package main

import "fmt"

func main() {
	var sum int
	var counter int
	
	fmt.Printf("%4s%20s\n", "Number", "Sum")
	
	for counter= 1; counter <=100; counter++ {
		sum +=counter
		
		fmt.Printf("%4d%20d\n", counter, sum)
	
	}

}
