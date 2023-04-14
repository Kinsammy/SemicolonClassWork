if __name__ =='__main__':
    largest = 0
    larger = 0
    number = int(input("Enter a number or -1 to quit the program: "))
    while number != -1:
        if number > largest:
            larger = largest
            largest = number

        if number < largest:
            if number > larger:
                larger = number
        number = int(input("Enter a number or -1 to quit the program: "))

    print(f"The Second largest is {larger}")

