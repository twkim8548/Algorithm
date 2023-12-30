arr = []

N = int(input())

for _ in range(N):
    str = input().strip().split()
    arr.append((int(str[0]), int(str[1])))

arr = sorted(arr, key=lambda x: x[1])
print(arr[0][0], arr[0][1])