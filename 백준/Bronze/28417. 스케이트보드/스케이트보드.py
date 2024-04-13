import sys
input = sys.stdin.readline

ans = 0
for _ in range(int(input())):
    nums = list(map(int, input().split()))
    runs = nums[0:2]
    tricks = nums[2:]
    tricks.sort(reverse=True)

    score = max(runs) + tricks[0] + tricks[1]
    ans = max(ans, score)
print(ans)