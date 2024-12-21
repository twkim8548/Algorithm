import sys
import datetime

input = sys.stdin.readline

a,b,c = map(int, input().split())
d = int(input())

start = datetime.datetime.now()
start = start.replace(hour=a, minute=b, second=c)

start += datetime.timedelta(seconds=d)

print(start.hour, start.minute, start.second)
