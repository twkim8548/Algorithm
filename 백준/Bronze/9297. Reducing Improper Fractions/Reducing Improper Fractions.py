for i in range(int(input())):
    a, b= map(int, input().split())
    if a//b == 0 and a%b == 0:
        print(f"Case {i + 1}: 0")
    elif a//b == 0:
        print(f"Case {i + 1}: {a%b}/{b}")
    elif a%b == 0:
        print(f"Case {i + 1}: {a // b}")
    else:
        print(f"Case {i + 1}: {a // b} {a%b}/{b}")