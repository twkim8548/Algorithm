n = int(input())
cnt = 0
i = 1
tot = 0
while True:
    tot += i ** 2
    if tot > n:
        print(cnt)
        break
    cnt += 1
    i += 2