import math
import sys

input = sys.stdin.readline

for _ in range(15):
    arr = input().strip().split()
    if 'w' in arr:
        print('chunbae')
        break
    elif 'b' in arr:
        print('nabi')
        break
    elif "g" in arr:
        print('yeongcheol')
        break

