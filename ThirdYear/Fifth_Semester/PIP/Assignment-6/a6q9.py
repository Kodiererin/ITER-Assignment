def reverse(str):
    if(len(str)<=1):
        return st
    else:
        str2 = '';
        i=0
        while(i<len(str)):
            str2 = str2+str[len(str)-1-i]
            i=i+1
        return str2


def reverseAString(str):
    print('Reversing')
    if(len(str)<1):
        return str
    else:
        str2=''
        a=''
        i=0
        while(i<len(str)-1):
            if(str[i]==' '):
                str2 = str2+a
                a=''
            a = a+str[i]
            i=i+1
            return str2    

#print(reverseAString('welcome to iter'))



def checkSymmetric(str):
    if(len(str)<1):
        return 0
    else:
        i=0
        while(i<len(str)/2):
            if(str[len(str)-1-i]!=str[i]):
                return False
            i=i+1
        return True


#print(checkSymmetric('racecar'))



#Check no of Vowels and Consonents

def vowConso(str):
    ctr=0
    i=0
    while(i<len(str)):
        if(str[i] in 'aeiouAEIOU'):
            ctr = ctr+1
        i=i+1
    print("Consonents = ",len(str)-ctr)
    print("Vowels = ",ctr)


#vowConso("Ujjwal")





























