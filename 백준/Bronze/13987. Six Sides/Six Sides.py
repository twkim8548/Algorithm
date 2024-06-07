arr = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

p, q = 0, 0

for i in range(6):
    for j in range(6):
        if arr[i] > arr2[j]:
            p += 1
        elif arr[i] == arr2[j]:
            q += 1

print(f"{p/(36-q):.5f}")