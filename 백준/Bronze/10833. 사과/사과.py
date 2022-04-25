N = int(input())
sum = 0

for i in range(N):
    S, A = map(int, input().split())
   
    sum += A % S

print(sum)