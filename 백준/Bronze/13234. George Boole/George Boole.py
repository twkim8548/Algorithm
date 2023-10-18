import math
import sys

input = sys.stdin.readline

v1, op, v2 = input().strip().split(" ")

if op == "AND":
    if v1 == "true" and v2 == "true":
        print("true")
    else:
        print("false")
else:
    if v1 == "true" or v2 == "true":
        print("true")
    else:
        print("false")