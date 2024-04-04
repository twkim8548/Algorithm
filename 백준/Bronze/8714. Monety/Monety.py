n= int(input())
one = 0
zero = 0
for num in input().split():
    num = int(num)
    if num == 0:
        zero += 1
    else:
        one += 1
print(min(zero, one))