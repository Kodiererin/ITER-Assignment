#!/bin/bash
echo "Enter File Name"
read f
if [ -d $f ]
then
echo "There exist a Directory"
else
	echo "$f Directory Doesnot exist"
	mkdir $f
	echo "Directory Created"
	ls -l
fi
