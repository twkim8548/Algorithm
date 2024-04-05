n = int(input())
str = input()
for c in str:
    if str.count('s') == str.count('t'):
        print(str)
        break
    else:
        str = str[1:len(str)]
