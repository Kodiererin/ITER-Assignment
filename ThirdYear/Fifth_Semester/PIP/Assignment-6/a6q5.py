# Count the Number of words using Regular Expression.

import re

def countWords(str):
    result = re.findall(r'[\w]+',str)
    print(result)
    return len(result)


print(countWords("What are your powers? I am Rich"));
