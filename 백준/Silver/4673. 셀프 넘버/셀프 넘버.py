import sys

input = sys.stdin.readline

s = set()

for i in range(10001):
    tot = i
    for j in str(i):
        tot += int(j)
    s.add(tot)

for i in range(10001):
    if i not in s:
        print(i)
