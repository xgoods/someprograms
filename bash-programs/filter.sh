#!/bin/bash

#this program computes the size of sub directories in a directory
#and computes the average size. Then it prints the subdirectories
#that have a higher directory size than the average
#Brian Goodwin

function average()
{
	count=0
	fileSizeIndex=0
	fileIndex=0
	
	for i in $files;
	do
		if [ $((count%2)) == 0 ]
		then
			theFileSize[fileSizeIndex]=${i#0}
			((fileSizeIndex++))
		fi
		((count++))
	done

	for((j=0;j<$((fileSizeIndex-1));j++));
	do
		total1=$((total1+theFileSize[j]))
	done
	avg=$((total1/fileSizeIndex))
	echo "The total file size is:" $total1 "KB"
	echo "The average file size:" $avg "KB"
}

function filter()
{
	
	for i in $files;
	do
		fileList[fileIndex]=$i
		
		((fileIndex++))
	done
	
	printf '\n'
	echo "The directories with a higher file size than the average file size"
	echo "------------------------------------------------------------------"	
	for((k=0;k<$((fileSizeIndex-1));k++));
	do
		
		if [ ${theFileSize[k]} -gt ${avg} ]
		then
			
			results=`du | grep ${theFileSize[k]}`
			echo $results
		fi
	done
}	
function main()
{
	cd ~/Downloads
	files=`du`
	
	average
	filter
}
main	
