def print_consecutive_pairs(word):
    for index in range(len(word)):
        print(word[index], end='')
        if index + 1 < len(word):
            print(word[index + 1])
        else:
            print()


if __name__ == '__main__':
    word = "VENTURES"
    print_consecutive_pairs(word)
