#!/bin/bash
#this program reverses the order of directories
#Brian Goodwin
function reverse()
{
	
	
	k=$1
	cd $k
	dir=(`for i in *; do echo "$i"; done`)
	count=${#dir[@]}
	
	echo "Directory List"
	echo "---------------------"
	
	for((i=0;i<$count;i++));
	do
		echo ${dir[i]}
	done
	
	printf '\n'
	echo "Reverse Directory List"
	echo "-------------------------"
	for ((i=$count;i>=0;i--)); do
	{
		temp=${dir[i]}
		reverseDir[i]=$temp
		echo ${reverseDir[i]}
	}
	done
	
}

function main()
{
	reverse
}
main
