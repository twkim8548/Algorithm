while True:
    n = int(input())

    if n == 0:
        break

    arr = list(map(int, input().split()))
    cnt = 0
    for i in range(1, len(arr) - 1):
        if arr[i - 1] < arr[i] > arr[i + 1]:
            cnt += 1
    print(cnt)