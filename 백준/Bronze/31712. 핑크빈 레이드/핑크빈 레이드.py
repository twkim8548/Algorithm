cu, du = map(int, input().split())
cd, dd = map(int, input().split())
cp, dp = map(int, input().split())

h = int(input())
cnt = 0
while h >= 0:
    if cnt % cu == 0:
        h -= du
    if cnt % cd == 0:
        h -= dd
    if cnt % cp == 0:
        h -= dp
    if h <= 0:
        break
    cnt += 1

print(cnt)