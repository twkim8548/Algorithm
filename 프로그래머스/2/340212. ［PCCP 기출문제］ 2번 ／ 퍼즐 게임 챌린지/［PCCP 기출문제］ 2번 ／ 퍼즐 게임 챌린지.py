def solution(diffs, times, limit):
    high = max(diffs)
    low = 1
    answer = high
    
    while low < high:
        level = int((low + high) / 2)
        time = times[0]
        
        for i in range(1, len(diffs)):
            diff = diffs[i]
            time_cur = times[i]
            time_prev = times[i - 1]
            k = 0
            if diff > level:
                k = diff - level
            time += ((time_prev + time_cur) * k) + time_cur
                
            
        if time <= limit:
            high = level
            answer = level
        else:
            low = level + 1
                
    return answer