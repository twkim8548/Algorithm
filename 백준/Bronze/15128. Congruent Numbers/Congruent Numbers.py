p1, q1, p2, q2 = list(map(int, input().split(" ")))
area = p1 * p2 / q1 / q2 / 2

if int(area) == area:
    print(1)
else:
    print(0)