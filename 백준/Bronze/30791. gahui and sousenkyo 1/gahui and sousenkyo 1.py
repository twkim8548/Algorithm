a, b, c, d, e = map(int, input().split())
cnt = 0
if a - 1000 <= b :
    cnt += 1
if a - 1000 <= c :
    cnt += 1
if a - 1000 <= d :
    cnt += 1
if a - 1000 <= e :
    cnt += 1
print(cnt)