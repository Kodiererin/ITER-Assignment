# 18. Create the following scripts importedModule and mainModule in the working directory, execute the
# script mainModule and justify the output.
# • importedModule.py
# def test1():
#     print(’test1 in imported
#     module’)
#
#     def test2():
#         print(’test2 in imported
#         module’)
#         test1()
#         test2()
#         • mainModule.py
#         import importModule
#         print(’hello’)



def test1():
    print('test1 in imported module')

def test2():
    print('test2 in imported module')
    test1()
    test2()


