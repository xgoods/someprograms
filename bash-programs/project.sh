#!/bin/bash
clear

sudo insmod ProcessList.ko

awk '
BEGIN {
print "--------------------------------------------------------------------------"
printf "%-20s %-8s %-8s %-8s %-8s %-8s\n", "Command", "PID", "PPID", "TGID", "State", "Policy"
print "--------------------------------------------------------------------------"
}
/command/ {printf "%-20s %-8s %-8s %-8s %-8s %-8s\n", $8,$10,$12,$14,$16,$18}
' /var/log/syslog

sudo rmmod ProcessList.ko
