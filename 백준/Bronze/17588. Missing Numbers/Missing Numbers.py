import sys

input = sys.stdin.readline

N = int(input())
cnt = 1
isBreak = False

for i in range(N):
    num = int(input())
    while num != cnt:
        isBreak = True
        print(cnt)
        cnt += 1
    cnt += 1

if not isBreak:
    print("good job")
