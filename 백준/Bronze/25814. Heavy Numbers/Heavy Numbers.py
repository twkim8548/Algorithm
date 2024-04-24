a, b = input().split()

a_weight = len(a)
tot = 0
for c in a:
    tot += int(c)
a_weight = a_weight * tot

b_weight = len(b)
tot = 0
for c in b:
    tot += int(c)
b_weight = b_weight * tot

if a_weight == b_weight:
    print(0)
elif a_weight > b_weight:
    print(1)
elif b_weight > a_weight:
    print(2)