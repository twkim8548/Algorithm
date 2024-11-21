import sys

input = sys.stdin.readline

# 서로 붙어 있는 두 개의 주사위에서
# 아래에 있는 주사위의 윗면에 적혀있는 숫자는
# 위에 있는 주사위의 아랫면에 적혀있는 숫자와 같아야 한다.

# A/F 0/5, B/D 1/3, C/E 2/4 -> 쌍
# A/F면이 바닥으로 가게 되면 BDCE중에서만 선택이 가능해진다
# B/D 중에서 선택하고 싶다면 A/F, C/E 중에 바닥으로 가야한다..

arr = []
ans = 0

for i in range(int(input())):
    arr.append(list(map(int, input().split())))

s = 1


def get_subs_arr_max(arr, find_index):
    if find_index == 0:
        back_index = 5
    elif find_index == 5:
        back_index = 0
    elif find_index == 1:
        back_index = 3
    elif find_index == 3:
        back_index = 1
    elif find_index == 2:
        back_index = 4
    elif find_index == 4:
        back_index = 2

    find_number = arr[find_index]
    back_number = arr[back_index]

    sub_arr = arr.copy()
    sub_arr.remove(find_number)
    sub_arr.remove(back_number)

    return max(sub_arr), back_number


while s <= 6:
    tot = 0
    start = s
    for sub_arr in arr:
        start_index = sub_arr.index(start)
        max_num, back_num = get_subs_arr_max(sub_arr, start_index)
        start = back_num
        tot += max_num
    ans = max(tot, ans)

    s += 1


print(ans)


