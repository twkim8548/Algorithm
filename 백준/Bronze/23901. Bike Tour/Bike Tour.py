for i in range(int(input())):
    print(f"Case #{i+1}: ", end="")
    n = int(input())
    arr = list(map(int, input().split()))
    max = 0
    ans = 0
    for j in range(1, n - 1):
        if arr[j - 1] < arr[j] > arr[j + 1] and max <= arr[j]:
            ans += 1
    print(ans)