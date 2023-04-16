package main

import "fmt"

func main() {
	
	var gradeA int 
	var gradeB int
	var gradeC int
	var gradeD int
	var gradeE int
	
	for i:=1; i <= 5; i++ {
		fmt.Print("Enter student name: ")
		var name string
		fmt.Scanf("%s", &name)
		
		fmt.Print("Enter student grade (A/B/C/D/E): ")
		var grade string
		fmt.Scanf("%s", &grade)
		
		switch grade {
			case "A": gradeA++
			case "B": gradeB++
			case "C": gradeC++
			case "D": gradeD++
			default: gradeE++
		
		}
	
	}
	
	fmt.Printf("Students with grade A: %d\n ", gradeA)
	fmt.Printf("Students with grade B: %d\n ", gradeB)
	fmt.Printf("Students with grade C: %d\n ", gradeC)
	fmt.Printf("Students with grade D: %d\n ", gradeD)
	fmt.Printf("Students with grade E: %d\n ", gradeE)


}
