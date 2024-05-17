arr1 = sorted(list(map(int, input().split())), reverse=True)
arr2 = sorted(list(map(int, input().split())), reverse=True)

print(arr1[0] * arr2[0] + arr1[1] * arr2[1] + arr1[2] * arr2[2])
