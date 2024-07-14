str = input()

if str[0:2] == 'io' and str[2:].isdigit():
    print("Correct")
else:
    print("Incorrect")