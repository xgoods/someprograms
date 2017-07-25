

letter='q'

userChoice=input('Would you like to enter an arithmatic expression?: ')

while(userChoice=='y' or userChoice=='Y'):

    stateCount=1 #holds the state 
    wCount=0 #holds the amount of ws in first extension
    acceptState=False #holds bool for acceptance state
    lst=[] #holds the stack
    parenCount=0 #holds paren count
    userString=input('Enter the arithmatic expression: ')
    flag=False
    print('You have entered the expression',userString)
    
    for x in userString: #reads each character in user string
        
        if(stateCount==1 and x=='$'):
            lst.append(x)
            print('You are currently in state:',letter,stateCount)
            print('your character is',x,'you popped epsilon and pushed $')
            stateCount+=1
            flag=True
            continue
        if(stateCount==2 and x=='('):
            lst.append(x)
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped epsilon and you pushed (')
            parenCount+=1
            flag=True
            continue
        if(stateCount==2 and (x.isalpha() or x=='_')):
            stateCount+=1
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped epsilon and you pushed epsilon')
            flag=True
            continue
        if(stateCount==2 and x.isdigit()):
            stateCount+=1
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped epsilon and you pushed epsilon')
            flag=True
            continue
        if(stateCount==3 and x==')'):
            if(parenCount==0):
                print('your expression was not accepted-CRASHED')
                break
            lst.remove('(')
            
            parenCount-=1
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped',x,'and you pushed epsilon')
            flag=True
            continue
        if(stateCount==3 and (x.isalpha() or x=='_')):
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped epsilon and you pushed epsilon')
            flag=True
            continue
        if(stateCount==3 and x.isdigit()):
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped epsilon and you pushed epsilon')
            flag=True
            continue
        if(stateCount==3 and (x=='+' or x=='-' or x=='*' or x=='/')):
            stateCount-=1
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped epsilon and you pushed epsilon')
            flag=True
            continue
        if(stateCount==3 and x=='$'):
            if('$' not in lst):
                print('your expression was not accepted-CRASHED')
                break
            lst.remove(x)
            print('your are currently in state',letter,stateCount)
            print('your character is',x,'you popped',x,'and you pushed epsilon')
            acceptState=True
            flag=True
            continue
        if((stateCount==1 and (x=='+' or x=='-' or x=='*' or x=='/')) or stateCount==2 and((x=='+' or x=='-' or x=='*' or x=='/'))):
            print('your expression was not accpeted-CRASHED')
            break
        if((x=='(' and stateCount==3) or (x==')' and stateCount==2)):
            print('your expression was not accpeted-CRASHED')
            break
        
    if(acceptState==True):
        print('your expression was accepted')
    else:
        print('your expression was not accepted')
    
    
        
    userChoice=input('Would you like to enter an arithmatic expression?: ')
            
            
            
            
            