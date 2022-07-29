def transform_text(s):
    return s[0]


memo_text = input()


split_memo_text = memo_text.split('-')

transform_memo_text = list(map(transform_text, split_memo_text))

print(''.join(transform_memo_text))
