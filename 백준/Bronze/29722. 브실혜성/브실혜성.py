import datetime

y, m, d = map(int, input().split('-'))
cycle = int(input())

d = d + cycle
m = m + ((d - 1) // 30)
d = (d - 1) % 30 + 1
y = y + ((m - 1) // 12)
m = (m - 1) % 12 + 1

date = datetime.datetime(y, m, d)
print(date.strftime('%Y-%m-%d'))
