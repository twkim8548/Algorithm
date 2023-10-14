import heapq
import sys

input = sys.stdin.readline

books = dict()

for _ in range(int(input())):
    name = input()
    if name in books:
        books[name] += 1
    else:
        books[name] = 1

maxValue = max(books.values())

arr = []
for k,v in books.items():
    if v == maxValue:
        arr.append(k)

arr.sort()
print(arr[0])