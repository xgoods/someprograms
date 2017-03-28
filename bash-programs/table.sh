#!/bin/bash
#This program parses certain html information and puts it in a table
#Brian Goodwin
wget -qO index.html https://youtube.com
cat index.html | while read line
do
	echo $line | grep -o "<li>[0-9,]* views</li>" | egrep -o '[0-9,]*'| sed 's/,//g' >> views.txt
	echo $line | grep -o "<a.*</a>" | egrep -o '/user/[a-zA-Z0-9 ]*' | sed 's/\/user\///g' >> user.txt
	echo $line | grep -o 'aria-hidden="true">[0-9]*:[0-9]*' | sed 's/aria-hidden="true">//g' >> time.txt
	echo $line | grep -o 'spf-link .* title="[a-zA-Z0-9 ]* .* "' | egrep -o 'title="[a-zA-Z0-9 ]*' | sed 's/title="//g' >> title2.txt
	echo $line | grep -o  '<span .*</span>' | egrep -o 'id="description-id-[0-9]*' | sed 's/id="description-id-//g' >> id.txt
done


sed '/Verified/d' ./title2.txt >> title.txt
paste user.txt title.txt views.txt time.txt id.txt >> finaltable.csv

