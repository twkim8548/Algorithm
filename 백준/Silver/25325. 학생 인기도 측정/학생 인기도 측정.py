import sys

input = sys.stdin.readline

n = int(input())

m = {}

for name in input().split():
    m[name] = 0


for i in range(n):
    arr_name = input().split()
    for name in arr_name:
        m[name] += 1

for i in sorted(m.items(), key=lambda x:(-x[1], x[0])):
    print(i[0], i[1])

