a = int(input())
b = int(input())
c = int(input())
d = int(input())
e = int(input())

if a > 0:
    print(abs((b-a) * e))
elif a == 0:
    print(d + abs((b-a) * e))
else:
    print(abs(a * c) + d + abs(b * e))