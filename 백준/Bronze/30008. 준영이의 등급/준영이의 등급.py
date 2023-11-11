import math
import sys

input = sys.stdin.readline

N, K = map(int, input().split())

arr = list(map(int, input().split()))

for i in arr:
    if math.floor(i * 100 / N) <= 4:
        print("1", end=" ")
    elif math.floor(i * 100 / N) <= 11:
        print("2", end=" ")
    elif math.floor(i * 100 / N) <= 23:
        print("3", end=" ")
    elif math.floor(i * 100 / N) <= 40:
        print("4", end=" ")
    elif math.floor(i * 100 / N) <= 60:
        print("5", end=" ")
    elif math.floor(i * 100 / N) <= 77:
        print("6", end=" ")
    elif math.floor(i * 100 / N) <= 89:
        print("7", end=" ")
    elif math.floor(i * 100 / N) <= 96:
        print("8", end=" ")
    else:
        print("9", end=" ")

