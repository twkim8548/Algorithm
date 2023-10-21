n, m , block = map(int, input().split())
lst = [list(map(int, input().split())) for _ in range(n)]
heights = [0] * 257
# 최소 높이, 최대 높이, 전체 블럭 개수의 합
min_v, max_v, total = 0, 0, 0
for i in range(n):
    for j in range(m):
        heights[lst[i][j]] += 1
        total += lst[i][j]
        if lst[i][j] > max_v:
            max_v = lst[i][j]
        elif lst[i][j] < min_v:
            min_v = lst[i][j]
        
answer = []
for num in range(min_v, max_v+1):
    time = 0
    inv = block
    # 주어진 블럭의 개수, 필요한 블럭의 개수
    if total + block >= num * n * m:
        for i in range(257):
            if heights[i] > 0:
                if i > num:
                    time += (i-num) * 2 * heights[i]
                    inv += (i - num) * heights[i]
                else:
                    time += (num - i) * heights[i]
                    inv -= (num - i) * heights[i]
        
        answer.append([time, num])
answer.sort(key=lambda x :(x[0], -x[1]))
print(*answer[0])