from collections import Counter
def solution(s):
    answer = ''
    sH = Counter(s)
    sl = list()

    for i in range(len(s)):
        if sH[s[i]] == 1:
            sl.append(s[i])

    if len(sl) == 0:
        return answer
    else:
        return ','.join(sorted(sl)).replace(',', '')