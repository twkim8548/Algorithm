t = int(input())
n = int(input())
arr = list(map(int, input().split()))

if sum(arr) >= t:
    print('Padaeng_i Happy')
else:
    print('Padaeng_i Cry')
