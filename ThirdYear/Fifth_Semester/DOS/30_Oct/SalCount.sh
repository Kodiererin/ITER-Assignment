read -p "Enter The Salary of Ramesh  " Salary
echo "Monthly Salary is $Salary"
da=`echo .40 \* $Salary | bc`
hr=$(echo 0.20 \* $Salary | bc)
echo "Montly Allowance $da"
echo "Monthly House Rent $hr"
echo "Your Total Allowance is "
echo $da + $hr + $Salary | bc	
