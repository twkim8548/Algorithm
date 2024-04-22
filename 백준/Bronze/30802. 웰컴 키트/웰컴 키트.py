n = int(input())
ex = list(map(int, input().split()))
t, p = map(int, input().split())
shirt = 0
for i in range(len(ex)):
    if ex[i]%t == 0:
        shirt += int(ex[i]/t)
    else:
        shirt += (int(ex[i]/t)+1)
print(shirt)
print(n // p, n % p)