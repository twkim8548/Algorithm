s1, s2 = map(int, input().split())
n1, n2 = map(int, input().split())
u1, u2 = map(int, input().split())

s = s2 * 10 / (s1 * 10 - 500 if s1 * 10 >= 5000 else s1 * 10)
n = n2 * 10 / (n1 * 10 - 500 if n1 * 10 >= 5000 else n1 * 10)
u = u2 * 10 / (u1 * 10 - 500 if u1 * 10 >= 5000 else u1 * 10)

if s > n and s > u:
    print("S")
elif n > s and n > u:
    print("N")
elif u > s and u > n:
    print("U")
