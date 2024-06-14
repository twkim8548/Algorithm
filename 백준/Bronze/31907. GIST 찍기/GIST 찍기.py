n = int(input())

arr = [['G', '.', '.', '.'], ['.', 'I', '.', 'T'], ['.', '.', 'S', '.']]
for arr2 in arr:
    for _ in range(n):
        for c in arr2:
            for _ in range(n):
                print(c, end='')
        print()
