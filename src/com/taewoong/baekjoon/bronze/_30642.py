n = int(input())
str = input()
k = int(input())

if str == "induck":
    if k % 2 == 0:
        print(k)
    else:
        if k + 1 > n:
            print(k-1)
        else:
            print(k+1)
else:
    if k % 2 == 1:
        print(k)
    else:
        if k + 1 > n:
            print(k-1)
        else:
            print(k+1)