def solution(participant, completion):
    dic = dict()
    for i in participant:
        try:
            dic[i] += 1
        except:
            dic[i] = 1

    for i in completion:
        if dic.get(i) is not None:
            dic[i] -= 1

    answer = ""
    for k, v in dic.items():
        if v != 0:
            answer = k
            break

    return answer