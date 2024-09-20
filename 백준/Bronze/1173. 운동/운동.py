N, m, M, T, R = map(int, input().split())
minimum = m

ans = 0
exercise = 0

while exercise < N:
    ans += 1
    if m + T <= M:
        exercise += 1
        m += T
    else:
        if m - R < minimum and exercise == 0:
            ans = -1
            break
        if m - R < minimum:
            m = minimum
        else:
            m -= R

print(ans)