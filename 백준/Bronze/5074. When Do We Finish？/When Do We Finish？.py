import sys
import datetime

input = sys.stdin.readline


while True:

    start, time = input().split()

    if start == "00:00" and time == "00:00":
        break

    start = datetime.datetime.strptime(start, '%H:%M')
    end = start + datetime.timedelta(hours=int(time.split(':')[0]), minutes=int(time.split(":")[1]))
    print(end.strftime('%H:%M'), end=' ')
    days = end.day - start.day
    if days > 0:
        print(f"+{days}")
    else:
        print()


