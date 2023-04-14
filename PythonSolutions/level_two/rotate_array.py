def rotate_array(arr):
    last_index = len(arr) - 1
    for first_index in range(last_index):
        for second_index in range(len(arr)):
            temp = arr[first_index]
            arr[first_index] = arr[last_index]
            arr[last_index] = temp
    print(arr)


if __name__ =='__main__':
    numbers = [1, 2, 3, 4, 5]
    rotate_array(numbers)
