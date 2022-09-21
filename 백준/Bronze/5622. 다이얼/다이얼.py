mList = ("ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ")
task = input()
time = 0
for i in range(len(mList)):
    for j in task:
        if j in mList[i]:
           time += i+3

print(time)
