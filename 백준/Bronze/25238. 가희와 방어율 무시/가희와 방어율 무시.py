import sys

input = sys.stdin.readline

a, b = map(int, input().split())

if a - (a * b / 100) >= 100:
    print("0")
else:
    print("1")