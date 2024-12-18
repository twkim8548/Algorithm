import sys
import datetime

input = sys.stdin.readline

x, y = map(int, input().split())

date = datetime.datetime(year=2007, month=x, day=y)
date = date.weekday()

if date == 0:
    print("MON")
elif date == 1:
    print("TUE")
elif date == 2:
    print("WED")
elif date == 3:
    print("THU")
elif date == 4:
    print("FRI")
elif date == 5:
    print("SAT")
elif date == 6:
    print("SUN")
