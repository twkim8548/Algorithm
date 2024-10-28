import sys

input = sys.stdin.readline

x, y = map(int, input().split())
z = int((y * 100) / x)
ans = 1000000001

origin_x, origin_y, origin_z = x, y, z

low = 1
high = origin_x

while low <= high:
    mid = (low + high) // 2
    x = origin_x + mid
    y = origin_y + mid
    z = int((y * 100) / x)

    if z != origin_z:
        ans = mid
        high = mid - 1
    else:
        low = mid + 1
if ans == 1000000001:
    print(-1)
else:
    print(ans)
