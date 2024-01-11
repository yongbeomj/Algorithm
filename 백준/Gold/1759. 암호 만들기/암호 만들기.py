import itertools
import sys

l, c = map(int, sys.stdin.readline().split())
alphabets = list(sys.stdin.readline().split())
alphabets.sort()

vowel = ['a', 'e', 'i', 'o', 'u']
result = []

passwords = list(itertools.combinations(alphabets, l))

for word in passwords:
    count = 0
    for ch in word:
        if ch in vowel:
            count += 1

    if count >= 1 and l-count >= 2:
        print(''.join(word))
