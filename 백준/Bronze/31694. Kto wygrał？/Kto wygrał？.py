arr = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
isWin = False

if sum(arr) > sum(arr2):
    print('Algosia')
elif sum(arr) < sum(arr2):
    print('Bajtek')
else:
    for i in reversed(range(1, 11)):
        if arr.count(i) > arr2.count(i):
            print('Algosia')
            isWin = True
            break
        elif arr.count(i) < arr2.count(i):
            print('Bajtek')
            isWin = True
            break
    if isWin is False:
        print('remis')