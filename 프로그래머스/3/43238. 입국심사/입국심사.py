def solution(n, times):
    
    low = 1
    high = max(times) * n
    
    while low <= high:
        mid = (low + high) // 2
        tot = 0

        for j in times:
            tot += mid // j
            
        if tot < n:
            low = mid + 1
        else:
            high = mid - 1
        
    return low