import sys

input = sys.stdin.readline

n = int(input())
ans = 0

if n == 1 or n == 3:
    print(-1)

else:
    while n > 0:
        if n % 5 == 0:
            ans += n // 5
            n = 0
        elif (n - 5) % 2 == 0:
            n -= 5
            ans += 1
        elif (n - 2) % 5 == 0 or (n - 2) % 2 == 0 :
            n -= 2
            ans += 1

    print(ans)