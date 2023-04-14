def count_occurrences(word):
    i_count = 0
    s_count = 0
    for letter in word:
        if letter == 'i':
            i_count += 1
        if letter == 's':
            s_count += 1
    print("i occurs", i_count, "times")
    print("s occurs", s_count, "times")


if __name__ == '__main__':
    word = "Mississippi"
    count_occurrences(word)
