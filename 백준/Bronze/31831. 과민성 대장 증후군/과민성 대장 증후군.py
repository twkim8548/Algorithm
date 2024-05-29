n, m = map(int, input().split())

cnt = 0
stress = 0
for num in list(map(int, input().split())):
    stress += num
    if stress <= 0:
        stress = 0
    if stress >= m:
        cnt += 1



print(cnt)