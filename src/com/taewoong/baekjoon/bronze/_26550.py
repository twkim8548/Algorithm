for i in range(int(input())):
    n = int(input())
    ans = 0
    tot = 0
    cnt = 1
    for j in range(n):
        tot += cnt
        ans += tot
        cnt += 1
    print(ans)
