import sys
from collections import deque

input = sys.stdin.readline

answers = [
    [1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 13],
    [1, 3, 5, 6, 7, 8, 9, 12, 13],
    [1, 3, 5, 6, 7, 8, 9, 12, 13],
    [1, 2, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 3, 5, 6, 7, 8, 12, 13],
    [1, 2, 3, 6, 7, 8, 12, 13]
]

n = int(input())

print(len(answers[n - 1]))
print(" ".join([chr(answers[n - 1][i] + 64) for i in range(len(answers[n - 1]))]))
