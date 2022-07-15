N = int(input())
mList = list(map(int, input().split()))
scoreList = []
count = 0

for i in mList:
    if i == 1:
        count += 1
    else:
        count = 0
    scoreList.append(count)
    
print(sum(scoreList))