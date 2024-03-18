answer = input()
for _ in range(int(input())):
    num = input()
    a = 0
    b = 0
    for i in range(len(answer)):
        if answer[i] == num[i]:
            b += 1
        if num[i] in answer:
            a += 1
    print(a, b)
