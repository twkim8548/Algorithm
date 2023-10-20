import sys
from collections import deque

input = sys.stdin.readline

n = int(input())

str = input().strip()

cntS = str.count('security')
cntB = str.count('bigdata')

if cntS > cntB:
    print('security!')
elif cntB > cntS:
    print('bigdata?')
else:
    print("bigdata? security!")