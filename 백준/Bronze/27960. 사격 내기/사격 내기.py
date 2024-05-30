n, m = map(int, input().split())

arr = [512,256,128,64,32,16,8,4,2,1]
ans = 0
for num in arr:
    isN, isM = False, False
    if 0 < num <= n:
        n -= num
        isN = True
    if 0 < num <= m:
        m -= num
        isM = True
    if (isN and not isM) or (isM and not isN):
        ans += num
print(ans)