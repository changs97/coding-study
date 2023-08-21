def solution(board):
    answer = 0
    dr = [-1, -1, 0, 1, 1, 1, 0, -1]
    dc = [0, 1, 1, 1, 0, -1, -1, -1]
    n = len(board)
    for r in range(n):
        for c in range(n):
            flag = True
            if board[r][c]:
                flag = False
            else:
                for k in range(8):
                    nr = r + dr[k]
                    nc = c + dc[k]
                    if 0 <= nr < n and 0 <= nc < n and board[nr][nc]:
                        flag = False
                        break
            if flag:
                answer += 1
    return answer