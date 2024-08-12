s = input()

ans = 0
n = 'K'
for c in s:
    if c == n:
        ans += 1
        if n == 'K':
            n = 'O'
        elif n == 'O':
            n = 'R'
        elif n == 'R':
            n = 'E'
        elif n == 'E':
            n = 'A'
        elif n == 'A':
            n = 'K'

print(ans)