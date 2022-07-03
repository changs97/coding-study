x, y = map(int, input().split())
dayList4 = ['MON', 'TUE', 'WED', 'THU', 'FRI', 'SAT', 'SUN']

dayList = list()
breaker = False

for i in range(1, x+1):
    dayList2 = list()
    for j in range(1, 32):
        if j == 31:
            if i == 4 or i == 6 or i == 9 or i == 11:
                break
        if j == 29:
            if i == 2:
                break
        dayList2.append(j)
        if i == x and j == y:
            breaker = True
            break
    dayList.append(dayList2)
    if breaker:
        break

dayList3 = sum(dayList, [])

day = len(dayList3)
if day > 7:
    print(dayList4[day % 7 - 1])
else:
    print(dayList4[day-1])



