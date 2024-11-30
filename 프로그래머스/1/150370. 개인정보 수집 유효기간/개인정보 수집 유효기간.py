
def solution(today, terms, privacies):
    answer = []

    today_year = int(today.split('.')[0])
    today_month = int(today.split('.')[1])
    today_date = int(today.split('.')[2])

    term_map = {}
    for term in terms:
        term_map[term.split()[0]] = int(term.split()[1])

    for i in range(len(privacies)):
        privacy_arr = privacies[i].split()
        privacy_type = privacy_arr[1]
        privacy_date = privacy_arr[0]
        privacy_year = int(privacy_date.split('.')[0])
        privacy_month = int(privacy_date.split('.')[1])
        privacy_date = int(privacy_date.split('.')[2])

        term_month = term_map.get(privacy_type)

        add_privacy_date = privacy_date - 1
        if add_privacy_date <= 0:
            privacy_month -= 1
            add_privacy_date = 28
            if privacy_month <= 0 :
                privacy_year -= 1
                privacy_month = 12

        add_privacy_month = privacy_month + term_month
        add_privacy_year = privacy_year + (add_privacy_month - 1) // 12
        add_privacy_month = (add_privacy_month - 1) % 12 + 1


        print(add_privacy_year, add_privacy_month, add_privacy_date)

        if today_year > add_privacy_year:
            answer.append(i + 1)
        else:
            if today_year == add_privacy_year and today_month > add_privacy_month:
                answer.append(i + 1)
            else:
                if today_year == add_privacy_year and today_month == add_privacy_month and today_date > add_privacy_date:
                    answer.append(i + 1)



    return answer
