globalVar = 10
def test():
    global globalVar
    localVar = 20
    globalVar = 30
    print('Inside function test: globalVar =', globalVar)
    print('Inside function test: localVar =', localVar)
test()
print('Outside function test: globalVar =', globalVar)

'''= RESTART: /media/student/ESD-USB/ITER-Assignment/ThirdYear/Fifth_Semester/PIP/Assignment-5/A5_M3.py
Inside function test: globalVar = 30
Inside function test: localVar = 20
Outside function test: globalVar = 30
>>> '''
