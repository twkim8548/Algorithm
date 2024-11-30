import sys

input = sys.stdin.readline

n = int(input())

for i in range(2, 10):
    for j in range(1, 10):
        if n == i or n == j or n == i * j:
            print(1)
            exit()
print(0)