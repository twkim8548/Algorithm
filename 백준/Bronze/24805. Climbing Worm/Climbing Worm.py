a, b, h = map(int,input().split())
cnt = 0
now = 0
while True:
    cnt += 1
    now = now + a
    if now >= h:
        break
    now = now - b

print(cnt)