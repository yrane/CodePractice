def match_string(test_str):
  i = 0
  for i in range(0,len(test_str)):
    for j in range(i+1,len(test_str)):
      if test_str[i] == test_str[j]:
          return False
          break

  return True

test_str = "abcdabcd"
result = match_string(test_str)

print result
