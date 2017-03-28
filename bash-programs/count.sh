#!/bin/bash
#This program prints the number of files that start with the letter in the /bin directory
#Brian Goodwin

cd /bin

a=(`ls | grep ^a`)
echo "a" ${#a[@]}

b=(`ls | grep ^b`)
echo "b" ${#b[@]}

c=(`ls | grep ^c`)
echo "c" ${#c[@]}

d=(`ls | grep ^d`)
echo "d" ${#d[@]}

e=(`ls | grep ^e`)
echo "e" ${#e[@]}

f=(`ls | grep ^f`)
echo "f" ${#f[@]}

g=(`ls | grep ^g`)
echo "g" ${#g[@]}

h=(`ls | grep ^h`)
echo "h" ${#h[@]}

i=(`ls | grep ^i`)
echo "i" ${#i[@]}

j=(`ls | grep ^j`)
echo "j" ${#j[@]}

k=(`ls | grep ^k`)
echo "k" ${#k[@]}

l=(`ls | grep ^l`)
echo "l" ${#l[@]}

m=(`ls | grep ^m`)
echo "m" ${#m[@]}

n=(`ls | grep ^n`)
echo "n" ${#n[@]}

o=(`ls | grep ^o`)
echo "o" ${#o[@]}

p=(`ls | grep ^p`)
echo "p" ${#p[@]}

q=(`ls | grep ^q`)
echo "q" ${#q[@]}

r=(`ls | grep ^r`)
echo "r" ${#r[@]}

s=(`ls | grep ^s`)
echo "s" ${#s[@]}

t=(`ls | grep ^t`)
echo "t" ${#t[@]}

u=(`ls | grep ^u`)
echo "u" ${#u[@]}

v=(`ls | grep ^v`)
echo "v" ${#v[@]}

w=(`ls | grep ^w`)
echo "w" ${#w[@]}

x=(`ls | grep ^x`)
echo "x" ${#x[@]}

y=(`ls | grep ^y`)
echo "y" ${#y[@]}

z=(`ls | grep ^z`)
echo "z" ${#z[@]}

