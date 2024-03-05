
# Sum of that divisor Number is Perfect Number

def perfectNumber(n):
    print("Checking the  Numbers")
    dup = n
    sum = 0
    i = 1
    while i<n:
        if dup%i==0:
            sum+=i
        i=i+1
    return sum-n

def main():
    num = int(input("Enter a Number  "))
    if(perfectNumber(num)==0):
        print("Perfect Number ")
    else:
        print("Not A Prefect Number")

main()
