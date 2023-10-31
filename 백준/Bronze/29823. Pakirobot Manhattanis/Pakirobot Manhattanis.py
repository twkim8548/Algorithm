import sys

input = sys.stdin.readline

N = int(input())
tot = 0

str = input()
nCnt = str.count('N')
eCnt = str.count('E')
sCnt = str.count('S')
wCnt = str.count('W')
print(abs(nCnt - sCnt) + abs(eCnt - wCnt))
