h = int(input())
m = int(input())
ans = 0
for t in range(1, m):
    ans =  (-6 * (t ** 4)) + (h * (t ** 3)) + (2 * (t ** 2)) + t

    if ans <= 0:
        print(f"The balloon first touches ground at hour: {t}")
        break
if ans > 0:
    print("The balloon does not touch ground in the given time.")