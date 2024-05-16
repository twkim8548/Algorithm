x, y = map(float,input().split())
n = int(input())
for _ in range(n):
    str = input().split()
    z = float(str[0])
    q = str[1]

    if q == 'A':
        print(y / x * z)
    else:
        print(x / y * z)