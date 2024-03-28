for _ in range(int(input())):
    n, c = map(int, input().split())
    ans = n//c
    if n% c > 0:
        ans += 1
    print(ans)