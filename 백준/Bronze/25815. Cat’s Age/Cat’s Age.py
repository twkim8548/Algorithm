y, m = map(int, input().split())

hy, hm = 0, 0
ansm = 0
if y < 1:
    hm = 15 * m
elif 1 <= y < 2:
    hy += 15
    hm = 9 * m
elif y >= 2:
    hy += 15 + 9
    y -= 2
    hy += y * 4
    hm = m * 4

if hm > 12:
    hy += hm // 12
    hm = hm % 12

print(hy, hm)