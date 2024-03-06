read -p "Enter the Marks of the Student " mks
read -p "Enter the Attendence of the Student " att

if (($mks>=20 && $att>=75)); then
        echo "Allowed for Semester"
else
        echo "Not Allowed for Semester"
fi