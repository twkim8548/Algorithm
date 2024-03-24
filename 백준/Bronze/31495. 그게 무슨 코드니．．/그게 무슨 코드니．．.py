str = input()

if str[0] != "\"" or str[len(str) - 1] != "\"" or str[1:len(str)-1] == '':
    print("CE")
else:
    print(str[1:len(str)-1])