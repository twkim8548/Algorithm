for i in range(int(input())):
    arr = list(map(int, input().split()))
    america = arr[0:3]
    russia = arr[3:]

    print(' '.join(map(str, arr)))
    if sum(america) > sum(russia):
        if america[0] > russia[0]:
            print('both')
        elif america[0] == russia[0] and america[1] > russia[1]:
            print('both')
        elif america[0] == russia[0] and america[1] == russia[1] and america[2] > russia[2]:
            print('both')
        else:
            print('count')
    else:
        if america[0] > russia[0]:
            print('color')
        elif america[0] == russia[0] and america[1] > russia[1]:
            print('color')
        elif america[0] == russia[0] and america[1] == russia[1] and america[2] > russia[2]:
            print('color')
        else:
            print('none')
    print()


