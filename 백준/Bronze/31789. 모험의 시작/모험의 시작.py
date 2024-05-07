n = int(input())

x, s = map(int, input().split())
isPass = False
for i in range(n):
    c, p = map(int, input().split())
    if x >= c and s < p:
        isPass = True
        break

print('YES' if isPass else 'NO')