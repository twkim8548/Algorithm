max_score = 0
min_time = 0
best_idx = -1

for i in range(int(input())):
    t, s = map(int, input().split())
    if s > max_score or (s == max_score and t < min_time):
        max_score = s
        min_time = t
        best_idx = i

if max_score == 0:
    print(0)
elif max_score == 1 or max_score == 4:
    print(min_time + best_idx * 20)
else:
    print(0)