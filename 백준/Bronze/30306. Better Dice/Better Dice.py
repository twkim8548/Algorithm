from itertools import combinations, product

n = int(input())

arr1 = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

first = 0
second = 0
arr1.sort()
arr2.sort(reverse=True)
for i in arr1:
    for j in arr2:
        if i > j:
            first += 1
        elif j > i:
            second += 1
if first == second:
    print("tie")
elif first > second:
    print("first")
else:
    print("second")