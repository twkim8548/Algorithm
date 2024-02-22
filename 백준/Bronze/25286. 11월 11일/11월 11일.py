import datetime as dt

for _ in range(int(input())):
    y, m = map(int, input().split())
    x = dt.datetime(y, m, m)
    beforeDate = x - dt.timedelta(days=m)

    print(f"{beforeDate.year} {beforeDate.month} {beforeDate.day}")