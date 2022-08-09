test = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

S = input()
TS = list()

for i in S:
    index = test.find(i)
    if index == 0 or index == 1 or index == 2:
        index += 23
    else:
        index -= 3
        
    TS.append(test[index])

print(''.join(TS))