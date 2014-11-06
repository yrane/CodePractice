import math
def primepalin():
    # inp = "malayalam"

    current_val = 0
    for num in range(2,1000):
        palin_flag = 0
        flag = 0
        for second in range(2, (int(round(math.sqrt(num))) + 1)):
            if num % second == 0 and num != second:
                flag = 1
                break
        if flag == 0:
            # print num
            inp = str(num)
            i = 0
            k = len(inp)
            while i < k:
                if inp[i] != inp[k-1]:
                    palin_flag = 1
                    break
                i += 1
                k -= 1
            if palin_flag == 0 and len(inp) > 1:
                # print inp
                # print current_val
                if int(inp) > current_val:
                    current_val = int(inp)
    return current_val

val = primepalin()
print val
