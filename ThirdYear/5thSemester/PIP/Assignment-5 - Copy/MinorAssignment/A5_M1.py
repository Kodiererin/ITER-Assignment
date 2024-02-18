globalVar = 10
def test():
    localVar = 20
    print('Inside function test: globalVar =', globalVar)
    print('Inside function test: localVar =', localVar)
test()
print('Outside function test: globalVar =', globalVar)
print('Outside function test: localVar =', localVar)


'''Inside function test: globalVar = 10
Inside function test: localVar = 20
Outside function test: globalVar = 10
Traceback (most recent call last):
  File "/usr/lib/python3.8/idlelib/run.py", line 559, in runcode
    exec(code, self.locals)
  File "/media/student/ESD-USB/ITER-Assignment/ThirdYear/Fifth_Semester/PIP/Assignment-5/A5_M1.py", line 8, in <module>
    print('Outside function test: localVar =', localVar)
NameError: name 'localVar' is not defined
>>> '''
