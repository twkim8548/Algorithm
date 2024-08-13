for i in range(int(input())):
    s = input().split()
    s.reverse()
    print(f"Case #{i+1}: ", end='')
    for c in s:
        print(c, end=' ')
    print()