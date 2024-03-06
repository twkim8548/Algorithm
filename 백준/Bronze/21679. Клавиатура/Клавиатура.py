n = int(input())

keyboard = list(map(int, input().split()))
t = int(input())
for num in input().split():
    keyboard[int(num) - 1] -= 1

for key in keyboard:
    if key < 0:
        print('yes')
    else:
        print('no')