import sys

input = sys.stdin.readline

A, B = map(int, input().split())
a = 1
b = 2 * A
c = B

x1 = int(((0-b) + (((b ** 2) - (4 * c)) ** (1/2))) / 2)
x2 = int(((0-b) - (((b ** 2) - (4 * c)) ** (1/2))) / 2)

print(x1) if x1 == x2 else print(min(x1, x2), max(x1, x2))