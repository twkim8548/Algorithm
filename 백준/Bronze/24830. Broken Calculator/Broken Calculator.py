ans = 1
for i in range(int(input())):
    arr = input().split()
    a = int(arr[0])
    b = int(arr[2])
    c = arr[1]

    if c == '+':
        ans = a + b - ans
        print(ans)
    elif c == '-':
        ans = (a - b) * ans
        print(ans)
    elif c == '*':
        ans = (a * b) ** 2
        print(ans)
    else:
        if a % 2 == 0:
            ans = a // 2
        else:
            ans = (a+1) // 2
        print(ans)
        