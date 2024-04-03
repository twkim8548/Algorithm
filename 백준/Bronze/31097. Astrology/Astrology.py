from datetime import date

str = input().split('-')
today = date(int(str[0]), int(str[1]), int(str[2]))

if date(today.year, 3, 21) <= today <= date(today.year, 4, 19):
    print('Aries')
elif date(today.year, 4, 20) <= today <= date(today.year, 5, 20):
    print('Taurus')
elif date(today.year, 5, 21) <= today <= date(today.year, 6, 20):
    print('Gemini')
elif date(today.year, 6, 21) <= today <= date(today.year, 7, 22):
    print('Cancer')
elif date(today.year, 7, 23) <= today <= date(today.year, 8, 22):
    print('Leo')
elif date(today.year, 8, 23) <= today <= date(today.year, 9, 22):
    print('Virgo')
elif date(today.year, 9, 23) <= today <= date(today.year, 10, 22):
    print('Libra')
elif date(today.year, 10, 23) <= today <= date(today.year, 11, 22):
    print('Scorpio')
elif date(today.year, 11, 23) <= today <= date(today.year, 12, 21):
    print('Sagittarius')
elif date(today.year, 12, 22) <= today <= date(today.year+1, 1, 19):
    print('Capricorn')
elif date(today.year-1, 12, 22) <= today <= date(today.year, 1, 19):
    print('Capricorn')
elif date(today.year, 1, 20) <= today <= date(today.year, 2, 18):
    print('Aquarius')
elif date(today.year, 2, 19) <= today <= date(today.year, 3, 20):
    print('Pisces')
