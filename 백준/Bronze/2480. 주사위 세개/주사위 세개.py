dice = list(map(int, input().split()))
n = len(set(dice))
s = 0

if dice[0] == dice[1]:
    s = dice[0]
elif dice[0] == dice[2]:
    s = dice[0]
elif dice[1] == dice[2]:
    s = dice[1]

if n == 1:
    print(10000+s*1000)
elif n == 2:
    print(1000+s*100)
else:
    dice.sort()
    print(int(dice[2])*100)