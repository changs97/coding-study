def solution(rank, attendance):
    answer = 0
    temp = []
    
    for i in range(len(rank)):
        if attendance[i]:
            temp.append([rank[i], i])
            
    temp.sort()
    
    answer = 10000 * temp[0][1] + 100 * temp[1][1] + temp[2][1]
    
    return answer