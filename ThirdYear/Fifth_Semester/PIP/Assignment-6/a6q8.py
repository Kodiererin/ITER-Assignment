# Count the Number of words using Regular Expression.

import re

def countWords():
    string1 = 'Python Programming Language'
    match1 = re.search('....m?', string1)
    print(match1.group())
    print(re.search('......m{1,2}', string1).group())
    print(re.search('.*Language$', string1).group())
    print(re.search('\w*\s\w*', string1).group())
    print(re.search('.*', string1).group())

def countWords2():
    string2 = 'Car Number DL5645'
    print(re.search('\w\w?\d{1,4}', string2).group())
    print(re.search('.*5', string2).group())
    print(re.search('.*5?', string2).group())
    print(re.search('\d{3}', string2).group())
    print(re.search('ˆ C.*5$', string2).group())

def countWords3():
    string3 = 'Car Number DL5645'
    #print(re.search('(c|d)*\d*(a|b)*', string3).group())
    #print(re.search('(cd)*d', string3).group())
    #print(re.search('(cc|cd)*(3|4)*(aa|bb)', string3).group())
    #print(re.search('(cc|cd|dd)*(3|4)*(aa|bb)', string3).group())
    print(re.search('(cc|cd|dd)*(3|4)*(aa|bb)*', string3).group())

countWords3()
