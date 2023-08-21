def solution(n):
    answer = [[0]*n for _ in range(n)]
    dr = [-1, 0, 1, 0]
    dc = [0, 1, 0, -1]
    k = len(answer)
    r, c = 0, -1
    see = 1
    cnt = 1

    while cnt <= n * n:
        nr = r + dr[see]
        nc = c + dc[see]

        if nr >= k or nr < 0 or nc >= k or nc < 0 or answer[nr][nc] != 0:
            see = (see + 1) % 4
        else:
            r = nr
            c = nc
            answer[r][c] = cnt
            cnt += 1

    return answer




