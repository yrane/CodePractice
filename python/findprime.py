import math
import sys

def primesum(args):

    for val in args:
        s = []
        i = 2
        while i < int(val):
            flag = 0

            for j in range(2, (int(round(math.sqrt(i)))+1)):
                if i%j == 0 and i != j:
                    flag = 1
                    break
            if flag == 0:
                s.append(i)
                # print str(i) + ",",

            i += 1
        print (','.join(str(x) for x in s))

arguments = open(sys.argv[1])
primesum(arguments)
