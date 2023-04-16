package main 

import "fmt"

func main() {
	
	
	var totalMile, totalGallons float64

	var counter int

	
	fmt.Print("Enter value mile driven or -1 to quit the program: ")
	var mile float64
	fmt.Scanf("%f", &mile)
	fmt.Print("Enter gallons used  or -1 to quit the program: ")
	var gallons float64
	fmt.Scanf("%f", &gallons)
	
	for mile != -1 && gallons != -1 {
	  milePerGallon := mile / gallons
	  totalMile += mile
	  totalGallons += gallons
	  fmt.Printf("The mile per gallon is: %.2f\n", milePerGallon)
	  counter++ 
	 
	 fmt.Println("Enter miles driven or press -1 to quit: ")
	 fmt.Scanf("%f", &mile)
	 
	 fmt.Println("Enter gallons used or press -1 to quit: ")
	 fmt.Scanf("%f", &gallons)
	  
	}
	
	if counter != 0 {
		average := totalMile / totalGallons
		
		fmt.Println("Total mile per liter is %.2f\n", totalMile)
		fmt.Println("Total gallons is %.2f\n", totalGallons)
		fmt.Println("The total trip is %.2f\n", counter)
		fmt.Println("Average is %.2f\n", average)
	} else {
		fmt.Println("No Trip!")
	}
	
	

}
