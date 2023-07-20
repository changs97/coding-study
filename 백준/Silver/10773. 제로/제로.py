import sys

stack = []
K = int(sys.stdin.readline().rstrip())

for i in range(K):
    num = int(sys.stdin.readline().rstrip())
    if num == 0 and len(stack) != 0:
        stack.pop()
    else:
        stack.append(num)

print(sum(stack))