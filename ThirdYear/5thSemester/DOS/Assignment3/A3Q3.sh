read -p "Enter Ramesh Salary " a
dr=$(echo $a*0.4 | bc)
hr=$(echo $a*0.2 | bc)
a=$(echo $a-$dr-$hr | bc)

echo "Dearness Allowance : $dr"
echo "House Rent : $hr"
echo "Gross Salary : $a"