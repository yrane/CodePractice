import math
def primesum():
    prime_sum = 0
    count = 0
    i = 2
    while count < 1000:
        flag = 0

        for j in range(2, (int(round(math.sqrt(i)))+1)):
            if i%j == 0 and i != j:
                flag = 1
                break
        if flag == 0:
            prime_sum  += i
            count += 1
        i += 1
    print prime_sum
primesum()
