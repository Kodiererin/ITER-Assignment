#!/bin/bash
echo "Enter File Name"
read f
if [ -e $f ]
then
echo "It is a file"
else
echo "$f is not a file"
fi
