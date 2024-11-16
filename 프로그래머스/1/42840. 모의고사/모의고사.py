def solution(answers):
    first_answers = [1, 2, 3, 4, 5]
    second_answers = [2, 1, 2, 3, 2, 4, 2, 5]
    third_answers = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    first_answer_cnt = 0
    second_answer_cnt = 0
    third_answer_cnt = 0
    
    for i in range(len(answers)):
        ans = answers[i]
        
        if first_answers[i % len(first_answers)] == ans:
            first_answer_cnt += 1
        if second_answers[i % len(second_answers)] == ans:
            second_answer_cnt += 1
        if third_answers[i % len(third_answers)] == ans:
            third_answer_cnt += 1
    
    answer = []
    
    if max(first_answer_cnt, second_answer_cnt, third_answer_cnt) == first_answer_cnt:
        answer.append(1)
    if max(first_answer_cnt, second_answer_cnt, third_answer_cnt) == second_answer_cnt:
        answer.append(2)
    if max(first_answer_cnt, second_answer_cnt, third_answer_cnt) == third_answer_cnt:
        answer.append(3)
    
    
    return answer