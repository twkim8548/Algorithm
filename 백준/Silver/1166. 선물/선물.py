import sys

input = sys.stdin.readline

n, l, w, h = map(int, input().split())

low = 0
high = max(l, w, h)

for i in range(100):
    mid = (low + high) / 2
    boxes = (l // mid) * (w // mid) * (h // mid)
    if boxes >= n:
        low = mid
    else:
        high = mid

print(high)
