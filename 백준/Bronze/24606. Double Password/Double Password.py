import sys

input = sys.stdin.readline

str = input().strip()
str2 = input().strip()

cnt = 0

for i in range(4):
    if str[i] != str2[i]:
        cnt += 1

print(pow(2, cnt))