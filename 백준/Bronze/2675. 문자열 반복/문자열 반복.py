T = int(input())

for i in range(T):
    P = list()
    R, S = input().split()
    for j in S:
        P.append(j*int(R))
    print("".join(P))