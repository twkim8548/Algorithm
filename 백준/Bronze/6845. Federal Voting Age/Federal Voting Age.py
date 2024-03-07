from datetime import datetime

date = datetime(2007, 2, 27)
for _ in range(int(input())):
    year, month, day = map(int, input().split())
    ymd = datetime(year, month, day)
    if (date - ymd).days >= 6574:
        print('Yes')
    else:
        print('No')