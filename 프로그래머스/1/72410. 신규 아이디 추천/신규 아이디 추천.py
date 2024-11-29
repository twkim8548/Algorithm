def solution(new_id):
    answer = '' 
    
    new_id = new_id.lower()

    for c in new_id:
        if 97 <= ord(c) <= 122 or 48 <= ord(c) <= 57 or c == '-' or c == '_' or c == '.':
            answer += c

    new_id = answer

    while '..' in new_id:
        new_id = new_id.replace('..', '.')

    if len(new_id) > 0 and new_id[0] == '.':
        new_id = new_id[1:]
    if len(new_id) > 0 and new_id[len(new_id) - 1] == '.':
        new_id = new_id[:len(new_id) - 1]

    if len(new_id) == 0:
        new_id = 'a'

    if len(new_id) >= 16:
        new_id = new_id[:15]

    if len(new_id) > 0 and new_id[len(new_id) - 1] == '.':
        new_id = new_id[:len(new_id) - 1]

    if len(new_id) <= 2:
        while len(new_id) < 3:
            new_id += new_id[len(new_id) - 1]

    answer = new_id
    return answer