sum=0
read -p "Enter You 5 Digit Number " a
a1=$(echo $a%10 | bc)
sum=$(echo $a1+$sum | bc)
a=$(echo $a/10 | bc)

a2=$(echo $a%10 | bc)
sum=$(echo $a2+$sum | bc)
a=$(echo $a/10 | bc)

a3=$(echo $a%10 | bc)
sum=$(echo $a3+$sum | bc)
a=$(echo $a/10 | bc)

a4=$(echo $a%10 | bc)
sum=$(echo $a4+$sum | bc)
a=$(echo $a/10 | bc)

sum=$(echo $a+$sum | bc)
echo $sum