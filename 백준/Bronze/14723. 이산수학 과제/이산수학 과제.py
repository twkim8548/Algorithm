n = int(input())

a = 1
b = 1
cnt = 1

for i in range(n):
    if i == n - 1:
        print(a, b)
    if a == 1:
        cnt += 1
        a = cnt
        b = 1
    else:
        a -= 1
        b += 1