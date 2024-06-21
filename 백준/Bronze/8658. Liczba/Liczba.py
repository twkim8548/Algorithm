n = int(input())

for i in range(2, n):
    if n % i != 0:
        print(i)
        break

for i in reversed(range(2, n)):
    if n % i != 0:
        print(i)
        break