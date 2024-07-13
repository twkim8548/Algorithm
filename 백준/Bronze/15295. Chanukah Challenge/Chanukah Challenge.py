for i in range(int(input())):
    n, m = map(int, input().split())
    ans = 0
    for i in range(1, m + 1):
        ans += i
    ans += m
    print(n, ans)