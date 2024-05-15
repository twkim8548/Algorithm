str = input()
a = 0
b = 0
for c in str:
    if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
        a += 1
        b += 1
    if c == 'y':
        b += 1

print(a, b)
