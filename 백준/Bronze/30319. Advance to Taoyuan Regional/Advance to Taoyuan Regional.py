import sys
from datetime import datetime

input = sys.stdin.readline

now = datetime.strptime("20231021", "%Y%m%d")
date_to_compare = datetime.strptime(input().strip(), "%Y-%m-%d")

date_diff = now - date_to_compare
if date_diff.days >= 35:
    print("GOOD")
else:
    print("TOO LATE")