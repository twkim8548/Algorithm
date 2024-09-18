import math

a, b = map(int, input().split())
n = int(input())

print(math.ceil((a * b) / 12) * n)
