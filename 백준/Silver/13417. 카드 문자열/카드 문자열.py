import sys

input = sys.stdin.readline


for _ in range(int(input())):
    n = int(input())
    arr = input().split()
    now_c = arr[0]
    ans = [now_c]

    for i in range(1, len(arr)):
        if ord(arr[i]) > ord(ans[0]):
            ans.append(arr[i])
        else:
            ans.insert(0, arr[i])
        now_c = arr[i]

    for c in ans:
        print(c, end='')
    print()
