a = 50
b = -50

while True:
    try:
        str = input()
        if str == '':
            break
        arr = str.split()
        for i in range(1, len(arr)):
            a = min(a, int(arr[i]))
            b = max(b, int(arr[i]))
    except EOFError:
        break
print(a, b)