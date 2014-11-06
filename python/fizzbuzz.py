import sys
# arguments = open(sys.argv[1]).read().split("\n")
arguments = open(sys.argv[1])
# arguments = [[3, 5, 20],[2,7,20]]
for args in arguments:
    nums = args.split()
    num1 = int(nums[0])
    num2 = int(nums[1])
    n = int(nums[2])
    for i in range(1, n+1):
        if i % num1 == 0 and i % num2 == 0:
            sys.stdout.write('FB '),
        elif i % num1 == 0:
            sys.stdout.write('F '),
        elif i % num2 == 0:
            sys.stdout.write('B '),
        else:
            sys.stdout.write(str(i)),
            print " ",
    print ""
