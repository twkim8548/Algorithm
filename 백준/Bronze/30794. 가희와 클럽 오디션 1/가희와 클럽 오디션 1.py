import math
import sys

input = sys.stdin.readline

num, state = input().strip().split()

num = int(num)

if state == 'miss':
    print(0)
elif state == 'bad':
    print(200 * num)
elif state == 'cool':
    print(400 * num)
elif state == 'great':
    print(600 * num)
elif state == 'perfect':
    print(1000 * num)