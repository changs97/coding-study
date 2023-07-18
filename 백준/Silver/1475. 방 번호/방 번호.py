N = input()

S = [0] * 10
for i in range(len(N)):
    num = int(N[i])
    if num == 6 or num == 9:
        if S[6] <= S[9]:
            S[6] += 1
        else:
            S[9] += 1
    else:
        S[num] += 1

set_count = max(S)

print(set_count)