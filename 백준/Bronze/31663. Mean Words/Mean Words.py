from math import floor

n = int(input())
arr = [input() for i in range(n)]

ans = ''
for i in range(len(max(arr, key=len))):
    num = 0
    cnt = 0
    for word in arr:
        if len(word) > i:
            num += ord(word[i])
            cnt += 1
    print(chr(floor(num / cnt)), end='')

