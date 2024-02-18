#!/bin/bash
echo "Enter File Name"
read f
if [ -e $f ]
then
echo "$f file is Empty"
else
echo "$f file is non empty"
fi
