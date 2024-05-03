a, b = map(int, input().split())
cnt = 0
while a < 5 and b < 5:
    if cnt == 0:
        b += a
        cnt = 1
    else:
        a += b
        cnt = 0

if a >= 5:
    print('yj')
else:
    print('yt')