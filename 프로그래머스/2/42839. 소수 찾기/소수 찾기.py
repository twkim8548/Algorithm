import math
import itertools

def is_prime(x):
    # 2부터 x의 제곱근까지의 모든 수를 확인하며
    for i in range(2, int(math.sqrt(x)) + 1):
        # x가 해당 수로 나누어 떨어진다면
        if x % i == 0:
            return False # 소수가 아님
    return True

def solution(numbers):
    answer = []
    arr = list(numbers)
    
    for i in range(len(numbers) + 1):
        npr = itertools.permutations(arr, i)
        for j in list(npr):
            s = ''.join(j)
            if s == '':
                continue
            
            n = int(''.join(j))
            
            if n == 0 or n == 1:
                continue

            if n not in answer and is_prime(n):
                answer.append(n)
        
    
    return len(answer)
