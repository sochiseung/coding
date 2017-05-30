def isUniqueString(arg):
    unique = True
    for index in range(len(arg)):
        print(" 2 index",arg[index])
        for target in arg[index+1:]:
            print(arg[index],target)
            if(arg[index] is target):
                print(" 1 index",arg[index],"target",target)
                unique = False
                break
        if(unique is False):
            break
    return unique
    
          
print(isUniqueString("korea"))
print(isUniqueString("japan"))
print(isUniqueString("example"))