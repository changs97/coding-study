allPrice = int(input())
priceList = []

for i in range(9):
    priceList.append(int(input()))

print(allPrice-sum(priceList))
