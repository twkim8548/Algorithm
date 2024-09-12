n = int(input())
ans = 0
isAdios = False
for i in range(n):
    a, b = map(int, input().split())

    if a == 1:
        ans += b
    else:
        if ans < b:
            isAdios = True
            break
        else:
            ans -= b

if isAdios:
    print("Adios")
else:
    print("See you next month")