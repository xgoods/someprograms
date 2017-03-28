#!/bin/bash
#this program takes command line arguements and puts them in ascending order
#Brian Goodwin

count=$#
params=($@)

function sortWord()
{
	echo "Unsorted params:" ${params[@]}
	for((i=0;i<${#params[@]}-1;i++));
	do
		min=$i
		for((j=($i+1);j<${#params[@]};j++));
		do
						
			if [[ ${params[j]} -lt ${params[min]} ]]
			then 
				min=$j 
			fi
		done
		temp=${params[i]}
		params[i]=${params[min]}
		params[min]=$temp
	done
	echo "Sorted params:" ${params[@]}
}

function main()
{
	sortWord
}
main
