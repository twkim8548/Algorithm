import datetime

def plus0(num):
    if num < 10:
        return f"0{num}"
    else:
        return f"{num}"

str = input()
if len(str) <= 2:
    now = datetime.datetime(year=2024, month=3, day=14, hour=0, minute=int(f"{str[0]}{str[1]}") )
elif len(str) <= 3:
    now = datetime.datetime(year=2024, month=3, day=14, hour=int(f"{str[0]}"), minute=int(f"{str[1]}{str[2]}") )
else:
    now = datetime.datetime(year=2024, month=3, day=14, hour=int(f"{str[0]}{str[1]}"), minute=int(f"{str[2]}{str[3]}") )

print(f"{(now.hour) if (now.hour) > 0 else ''}{plus0(now.minute)} in Ottawa")
print(f"{((now - datetime.timedelta(hours=3)).hour) if ((now - datetime.timedelta(hours=3)).hour) > 0 else ''}{plus0((now - datetime.timedelta(hours=3)).minute)} in Victoria")
print(f"{((now - datetime.timedelta(hours=2)).hour) if ((now - datetime.timedelta(hours=2)).hour) > 0 else ''}{plus0((now - datetime.timedelta(hours=2)).minute)} in Edmonton")
print(f"{((now - datetime.timedelta(hours=1)).hour) if ((now - datetime.timedelta(hours=1)).hour) > 0 else ''}{plus0((now - datetime.timedelta(hours=1)).minute)} in Winnipeg")
print(f"{(now.hour) if (now.hour) > 0 else ''}{plus0(now.minute)} in Toronto")
print(f"{((now + datetime.timedelta(hours=1)).hour) if ((now + datetime.timedelta(hours=1)).hour) > 0 else ''}{plus0((now + datetime.timedelta(hours=1)).minute)} in Halifax")
print(f"{((now + datetime.timedelta(hours=1, minutes=30)).hour) if ((now + datetime.timedelta(hours=1, minutes=30)).hour) > 0 else ''}{plus0((now + datetime.timedelta(hours=1, minutes=30)).minute)} in St. John's")