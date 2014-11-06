import sys
test_words = open(sys.argv[1]).read().split("\n")
for test in test_words:
    rev_words = [None] * len(test)
    curr_size = len(test) - 1
    temp_arr = [None] * len(test)
    j = 0
    count = 0
    for i in test:
        temp_arr[j] = i
        # print temp_arr[j]
        count += 1
        p = j - 1
        if i == " " or count == len(test):
            if count == len(test):
                j += 1
                p += 1
            for k in range(0,j):
                rev_words[curr_size-p] = temp_arr[k]
                # curr_size = 1
                p -= 1
                # print temp_arr[k]
                # print rev_words

            # print rev_words
            if count != len(test):
                curr_size -= j
                j = 0
                rev_words[curr_size] = i
                curr_size -= 1
                continue
        j += 1

    print ''.join(rev_words)
