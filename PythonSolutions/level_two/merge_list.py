def merge_sorted_arrays(arr1, arr2):
    merged_arr = []
    i = 0
    j = 0

    while i < len(arr1) and j < len(arr2):
        if arr1[i] < arr2[j]:
            merged_arr.append(arr1[i])
            i += 1
        else:
            merged_arr.append(arr2[j])
            j += 1

    while i < len(arr1):
        merged_arr.append(arr1[i])
        i += 1

    while j < len(arr2):
        merged_arr.append(arr2[j])
        j += 1

    return merged_arr

# Example sorted arrays

if __name__ =='__main__':
    arr1 = [1, 3, 5, 7]
    arr2 = [2, 4, 6, 8]

    merged_arr = merge_sorted_arrays(arr1, arr2)
    print(merged_arr)
    # for num in merged_arr:
    #     print(num, end=" ")
