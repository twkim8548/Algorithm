import math
import sys

input = sys.stdin.readline

N = int(input())
ans = 0

hint = [list(map(int, input().split())) for _ in range(N)]

for a in range(1, 10):
    for b in range(1, 10):
        for c in range(1, 10):
            if a == b or b == c or a == c:
                continue

            cnt = 0
            for arr in hint:
                num = arr[0]
                strike = arr[1]
                ball = arr[2]

                strike_count = 0
                ball_count = 0

                if str(num)[0] == str(a):
                    strike_count += 1
                if str(num)[1] == str(b):
                    strike_count += 1
                if str(num)[2] == str(c):
                    strike_count += 1

                if str(num)[0] == str(b) or str(num)[0] == str(c):
                    ball_count += 1
                if str(num)[1] == str(a) or str(num)[1] == str(c):
                    ball_count += 1
                if str(num)[2] == str(a) or str(num)[2] == str(b):
                    ball_count += 1

                if strike == strike_count and ball == ball_count:
                    cnt += 1

            if cnt == N:
                ans += 1

print(ans)