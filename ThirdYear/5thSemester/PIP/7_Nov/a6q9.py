
# Reversing a String
def reverse(x):
    y = ''
    for i in range(len(x)):
        y = y+x[len(x)-1-i]
    return y


# Reversing the String without reversing the words

def stringReverseWithoutWords(x):
    x = x+' '
    y = ''
    letter = ''
    for i in range(len(x)):
        y = y+x[i]
        if x[i] == ' ':
            letter  = y+letter
            y = ''
    return letter

# Check if the String is Symmetric or Not?

def symmetric(x):
    n = len(x)//2
    for i in range(n):
        if(x[i]!=x[len(x)-1-i]):
           return 'Asymmetric'
    return 'Symmetric'

# Check if the String is Palindrome
def palindrome(x):
    if symmetric(x)=='Symmetric':
        return True
    else:
        return False

# Delete the ith value from String

def delIValue(x , j):
    y=''
    if j<len(x):
        for i in range(len(x)):
            if i==j:
                continue
            else:
                y = y+x[i]
        return y
    else:
        return -1

# Count the number of vowels and consonents

def vowelConsonents(x):
    vow = 'aeiou'
    vowel=0
    consonent=0
    for i in range(len(x)):
        if x[i] in vow:
            vowel=vowel+1
        else:
            consonent = consonent+1
    print('Consonent = ',consonent,'Vowels = ',vowel )

# Length of the String

def lengthStr(x):
    i=0
    while(x[i]<(str)'125'):
        i=i+1
        print(x[i])
    return i

print(reverse('Ujjwal'))
print(stringReverseWithoutWords('Hello World Kem Cho'))
print(symmetric('racecar'))
print(symmetric('ujjwal'))

print(palindrome('noon'))
print(delIValue('ujjwal',4))
vowelConsonents('Count the Vowels')
print(lengthStr('Hello World'))


