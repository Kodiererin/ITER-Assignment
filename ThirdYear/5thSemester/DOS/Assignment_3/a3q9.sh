read -p "Enter the Character " char
if ((char>=0 && char<=9))
then
echo "Number"
else
	if [[char>='A' && char<='Z']]
	then
	echo "UpperCase"
	elif [[char >='a' && char<='z']]
	then
	echo "Lower Case"
	else
	echo "Special Character"
fi
