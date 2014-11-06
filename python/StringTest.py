# Three ways to reverse a string

test = "This is a test"
# First and most elegant
rev = ''.join(reversed(test))
print rev

#Second
rev_letters = [None] * len(test)

curr_size = len(test) - 1
for i in test:
    rev_letters[curr_size] = i
    curr_size -= 1

print ''.join(rev_letters)

#Third
rev = ''

for i in range(len(test)-1,-1,-1):
   rev+=test[i]

print rev
