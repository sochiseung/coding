def replaceBits(N,M,sIdx,eIdx):
    "This is a function to replace"
    print('N :',bin(N))
    print('M :',bin(M))
    print('from :',sIdx)
    print('to :',eIdx)
    
    #Remember N's right two bits
    RBITS=pow(2,sIdx)-1
    print('step#1: RBITS ',bin(RBITS))
    
    tmpBits=N&RBITS
    print('step#2: tmpBits ',bin(tmpBits))
    
    #BitMasking N to fill number 0
    N>>=eIdx#eg) N:1000000, eIdx:4 after=> 10
    N<<=eIdx-sIdx
    print('step#3: processing N ', bin(N))
    
    #Replace N[sIdx,eIdx] to M
    N=N|M
    print('step#4: processing N ',bin(N))
    
    #Add tmpBits
    N<<=sIdx
    N=N|tmpBits
    
    print("output", bin(N))
    
if __name__=='__main__':
    replaceBits(1024,21,2,6)