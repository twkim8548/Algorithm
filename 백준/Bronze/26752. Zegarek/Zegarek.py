import datetime

h, m, s = map(int, input().split())
date = datetime.datetime(year=2020, month=1, day=1, hour=h, minute=m, second=s) + datetime.timedelta(seconds=1)
print(date.strftime("%H:%M:%S"))