
def wordsNum(x):
    a = {'1': 'one', '2': 'two', '3': 'three', '4': 'four', '5': 'five', '6': 'six', '7': 'seven', '8': 'eight',
         '9': 'nine', '0': 'zero'}
    if(x//10==0):
        print(a.get(str(x % 10)))
    else:
        print(a.get(str(x%10)))
        wordsNum(x // 10)

wordsNum(198)
