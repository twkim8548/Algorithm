import math
import sys
from itertools import combinations, permutations

input = sys.stdin.readline

direc = "left"
while True:
    str = input().strip()
    if str == '99999':
        break
    if (int(str[0]) + int(str[1])) != 0:
        if (int(str[0]) + int(str[1])) % 2 == 1:
            direc = "left"
        elif (int(str[0]) + int(str[1])) % 2 == 0:
            direc = "right"

    print(f"{direc} {str[2]}{str[3]}{str[4]}")


