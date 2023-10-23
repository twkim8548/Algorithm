import sys

input = sys.stdin.readline

str = input().strip()
cnt = 0
for i in range(len(str) - 3):
    if str[i] == "k" and str[i + 1] == "i" and str[i+2] == "c" and str[i+3] == "k":
        cnt += 1

print(cnt)

