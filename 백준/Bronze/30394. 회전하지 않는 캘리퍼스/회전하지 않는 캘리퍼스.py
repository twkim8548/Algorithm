n = int(input())

maxY = None
minY = None

for i in range(n):
    x,y = map(int, input().split())
    if minY is None:
        minY = y
    else:
        minY = min(minY, y)
    if maxY is None:
        maxY = y
    else:
        maxY = max(maxY, y)

print(maxY - minY)
