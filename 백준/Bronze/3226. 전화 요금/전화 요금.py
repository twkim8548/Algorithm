ans = 0

for i in range(int(input())):
    time, dd = input().split()
    dd = int(dd)
    hh = int(time.split(':')[0])
    mm = int(time.split(':')[1])
    for j in range(dd):
        if 7 <= hh < 19:
            ans += 10
        else:
            ans += 5
        mm += 1
        if mm >= 60:
            hh += 1
            mm = 0
        if hh >= 24:
            hh = 0
print(ans)