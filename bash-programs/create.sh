#!/bin/bash
#This program creates a tree of depth d and bredth b in a certain location
#Brian Goodwin
    
location=$3
breadth=$2
depth=$1
searchType=$4

if [[ searchType -eq "depth" || searchType -eq "breadth" ]]
then

	for((i=0;i<depth;i++)); 
	do
		for x in ${location[@]}; 
		do
    		temp=( )
        	for((j=0;j<breadth;j++)); 
			do
        		mkdir -p $x/$j
            	temp=($temp $x/$j)
        	done
    	done
    	location=($temp)
	done
fi




