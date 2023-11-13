import math
import sys

input = sys.stdin.readline

arr = list(map(int, input().split()))

if (arr[0] > 100
        or arr[1] > 100
        or arr[2] > 200
        or arr[3] > 200
        or arr[4] > 300
        or arr[5] > 300
        or arr[6] > 400
        or arr[7] > 400
        or arr[8] > 500):
    print("hacker")
elif sum(arr) >= 100:
    print("draw")
else:
    print("none")
