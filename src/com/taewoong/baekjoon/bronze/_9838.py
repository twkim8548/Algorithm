n = int(input())
arr = []
for i in range(n):
    arr.append((int(input()), i+1))

arr.sort(key=(lambda x:x[0]))
for i in arr:
    print(i[1])
