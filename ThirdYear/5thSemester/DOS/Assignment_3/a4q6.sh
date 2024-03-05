read -p "Enter the Internal Mark and Attendence in Percentage " mark  attendence
echo "Entered Mark $mark and attendence $attendence"


if ((mark>19))
then
if ((attendence>74))
then
echo "Allowed for semester"
else
echo "Not allowed for Semester"
fi
else
echo "Not Allowed for Semester"
fi
