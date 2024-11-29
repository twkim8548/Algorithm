import sys

input = sys.stdin.readline

n = int(input())

dic = {}

for _ in range(n):
    for j in range(4):
        arr = input().split()
        for i in range(len(arr)):
            if arr[i] == '-':
                continue
            if not arr[i] in dic:
                dic[arr[i]] = 0
            if j == 0:
                dic[arr[i]] += 4
            elif j == 1:
                dic[arr[i]] += 6
            elif j == 2:
                dic[arr[i]] += 4
            elif j == 3:
                dic[arr[i]] += 10
print("Yes" if len(dic) == 0 or max(dic.values()) - min(dic.values()) <= 12 else "No")