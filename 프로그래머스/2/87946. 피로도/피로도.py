import itertools

def solution(k, dungeons):
    answer = 0
    for permutation in itertools.permutations(dungeons, len(dungeons)):
        now = k
        cnt = 0
        for dungeon in list(permutation):
            min = dungeon[0]
            use = dungeon[1]
            if now >= min:
                cnt += 1
                now -= use
            else:
                break
            
        if cnt > answer:
            answer = cnt
        
    
    return answer