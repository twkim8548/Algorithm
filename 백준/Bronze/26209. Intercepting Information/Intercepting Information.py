arr = list(map(int, input().split()))

if arr.count(0) + arr.count(1) == 8:
    print('S')
else:
    print('F')