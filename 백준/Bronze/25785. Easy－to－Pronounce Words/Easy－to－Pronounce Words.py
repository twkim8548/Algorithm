import math
import sys

input = sys.stdin.readline

str = input().strip()
isVowel = str[0] == 'a' or str[0] == 'e' or str[0] == 'i' or str[0] == 'o' or str[0] == 'u'
ans = True
for c in str[1:]:
    if isVowel:
        if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
            ans = False
            isVowel = True
        else:
            isVowel = False
    else:
        if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
            isVowel = True
        else:
            ans = False
            isVowel = False
print(+ans)