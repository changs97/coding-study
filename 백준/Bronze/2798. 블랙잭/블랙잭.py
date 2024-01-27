from itertools import combinations

N, M = map(int, input().split())
cardList1 = list(map(int, input().split()))
cardList2 = list(combinations(cardList1, 3))
cardList3 = list()

for i in cardList2:
    _sum = sum(i)
    if _sum <= M:
        cardList3.append(_sum)
        
print(max(cardList3))