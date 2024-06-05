def solution(arr):
    answer = []

    for i in arr:
        if len(answer) != 0:
            temp = answer.pop()
            answer.append(temp)
            if temp != i:
                answer.append(i)
        else:
            answer.append(i)
    return answer