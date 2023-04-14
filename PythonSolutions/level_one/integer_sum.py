def integer_sum():
    end = 30
    total = 0

    for start in range(1, end+1):
        if start % 3 == 0:
            total += start

    print("The sum of integers between 1 and 30 that are divisible by 3 is:", total)

if __name__ == '__main__':
    integer_sum()