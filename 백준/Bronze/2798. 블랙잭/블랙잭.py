from itertools import combinations

N, M = map(int, input().split())
cardList = list(map(int, input().split()))
cardList2 = list(combinations(cardList, 3))
list3 = []
for i in cardList2:
    pickCard = M - sum(i)
    if pickCard >= 0:
        list3.append(pickCard)

list3.sort()

print(M-list3[0])