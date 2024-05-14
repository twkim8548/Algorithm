n= int(input())

arr = []
seat = []

for i in range(10):
    seat.append([])
    for j in range(20):
        seat[i].append('.')

for i in range(n):
    str = input()
    seat[ord(str[0]) - 65][int(str[1:]) - 1] = 'o'

for i in seat:
    for j in i:
        print(j, end='')
    print()