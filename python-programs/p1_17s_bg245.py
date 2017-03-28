'''
Brian Goodwin
'''

letter='q'

userChoice=input('Would you like to enter a string?: ')

while(userChoice=='y' or userChoice=='Y'):

	stateCount=1 #holds the state 
	wCount=0 #holds the amount of ws in first extension
	trapState=False #holds bool for trap state
	acceptState=False #holds bool for acceptance state

	userString=input('Enter a string in lowercase URL format: ')
	print('You have entered the URL',userString)
	
	print('You are currently in state:',letter,stateCount)	
	
	for x in userString: #reads each character in user string
		print('Your character is: ',x)
		
		if(x=='w' and trapState is False):
			stateCount+=1
			print('Youre in state:',letter,stateCount)
			wCount+=1
			continue
		
		if(x!='w' and x!='.' and wCount!=3 and stateCount==1 and trapState is False):
			stateCount=6
			print('Youre in state:',letter,stateCount)
			continue
		if(x.isalpha() and stateCount==6 and trapState is False):
			stateCount=6
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='.' and stateCount==6 and trapState is False):
			stateCount=10
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='.' and wCount!=3 and wCount!=0):
			stateCount=5
			print('Youre in a trap state:',letter,stateCount)
			trapState=True
			continue
		if(trapState is True):
			print('Youre in a trap state:',letter,stateCount)
			continue

		if(x=='.' and stateCount==4 and trapState is False):
			stateCount=7			
			print('Youre in state:',letter,stateCount)
			continue
		if(stateCount==7 and x.isalpha() and trapState is False):
			stateCount=9
			print('Youre in state:',letter,stateCount)
			continue
			

		if(x=='.' and stateCount==7 and trapState is False):
			stateCount=8
			trapState=True			
			print('Youre in a trap state:',letter,stateCount)
			continue

		if(x.isalpha() and stateCount==4 and trapState is False):
			stateCount=9			
			print('Youre in state:',letter,stateCount)
			continue

		if(stateCount==9 and x.isalpha() and trapState is False):
			print('Youre in state:',letter,stateCount)
			continue
		
		if(x=='.' and stateCount==9 and trapState is False):
			stateCount=10
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='c' and stateCount==10 and trapState is False):
			stateCount=12
			print('Youre in state:',letter,stateCount)
			continue
		if(x!='c' and stateCount==10 and trapState is False):
			trapState=True
			stateCount=11
			print('Youre in a trap state:',letter,stateCount)
			continue
		if(x.isalpha() and stateCount==9 and x!='a' and x!='o' and trapState is False):
			stateCount=9
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='a' and stateCount==12 and trapState is False):
			stateCount=13
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='.' and stateCount==13 and trapState is False):
			stateCount=10
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='o' and stateCount==12 and trapState is False):
			stateCount=14
			print('Youre in state:',letter,stateCount)
			continue

		if(x.isalpha() and x!='m' and stateCount==14 and trapState is False):
			stateCount=9
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='.' and stateCount==14 and trapState is False):
			stateCount=15
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='c' and stateCount==15 and trapState is False):
			stateCount=16
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='a' and stateCount==16 and trapState is False):
			stateCount=17
			print('Youre in state:',letter,stateCount)
			continue
		if(x=='m' and stateCount==14 and trapState is False):
			stateCount=18
			print('Youre in state:',letter,stateCount)
			continue

	
	if(stateCount==9 or stateCount==13 or stateCount==17 or stateCount==18):
		acceptState=True
	
	if(acceptState is True):
		print('This is an accepted string')
	else:
		print('This is not an accepted string')
	
		
	userChoice=input('Would you like to enter a string?: ')
		
		
		
	
		
		

