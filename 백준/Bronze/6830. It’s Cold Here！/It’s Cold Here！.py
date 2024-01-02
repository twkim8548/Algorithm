import sys

input = sys.stdin.readline

arr = []
while True:
    city, tem = input().strip().split()
    if city == 'Waterloo':
        break
    arr.append((city, tem))

arr.sort(key= lambda x: int(x[1]))

print(arr[0][0])
