scoreList = list()
for i in range(5):
    scoreList.append(sum(list(map(int, input().split()))))

print(scoreList.index(max(scoreList))+1, max(scoreList))