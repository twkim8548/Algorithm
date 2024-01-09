import sys

input = sys.stdin.readline

tot = 0
for i in range(10):
    if i == 0:
        tot = int(input())
    else:
        tot -= int(input())

print(tot)