import sys

input = sys.stdin.readline


def average(lst):
    return int(sum(lst) / 5)


def median(lst):
    return lst[2]


numbers = [int(input()) for _ in range(5)]
numbers.sort()

print(average(numbers))
print(median(numbers))
