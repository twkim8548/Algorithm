def solution(answers):
    answer = []
    person1 = [1,2,3,4,5]
    person2 = [2,1,2,3,2,4,2,5]
    person3 = [3,3,1,1,2,2,4,4,5,5]
    
    tot1, tot2, tot3 = 0, 0, 0
    
    for i in range(len(answers)):
        ans = answers[i]
        if ans == person1[i%5]:
            tot1 += 1
        if ans == person2[i%8]:
            tot2 += 1
        if ans == person3[i%10]:
            tot3 += 1
    print(tot1, tot2, tot3)
    if tot1 > tot2 and tot1 > tot3: 
        answer = [1]
    elif tot1 == tot2 and tot2 > tot3:
        answer = [1,2]
    elif tot1 == tot2 and tot2 == tot3:
        answer = [1,2,3]
    elif tot2 > tot1 and tot2 > tot3:
        answer = [2]
    elif tot2 == tot3 and tot2 > tot1:
        answer = [2,3]
    elif tot3 > tot2 and tot3 > tot1:
        answer = [3]
    elif tot1 == tot3 and tot1 > tot2:
        answer = [1,3]
    
    return answer