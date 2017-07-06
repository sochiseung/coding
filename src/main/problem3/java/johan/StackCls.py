'''This is my stack'''
class Stack:
    def __init__(self):
        self.stack=[]
        self.mininum = None
        
    def push(self,data):
        self.stack.append(data)
        if self.mininum is None:
            self.mininum = data
        else:
            if self.mininum > data:
                self.mininum = data
    
    def pop(self):
        return self.stack.pop()
        
    def min(self):
        return self.mininum
        
if __name__=="__main__":
    myStack=Stack()
    myStack.push(10)
    myStack.push(2)
    myStack.push(3)
    myStack.push(5)
    myStack.push(15)
    myStack.push(-3)
    print('Minimum value',myStack.min())