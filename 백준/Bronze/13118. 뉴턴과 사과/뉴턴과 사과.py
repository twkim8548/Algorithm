arr = list(map(int, input().split()))
x, y, r = map(int, input().split())

isFound = False
for i, num in enumerate(arr):
    if x == num:
        print(i+1)
        isFound = True

if not isFound:
    print(0)