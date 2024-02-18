read a
read b
sum=$(echo $a+$b | bc)
diff=$(echo $a-$b | bc)
prod=$(echo  $a*$b | bc)
quot=$(echo $a/$b | bc)

echo "Sum = $sum"
echo "Difference = $diff"
echo "Product = $prod"
echo "Quotient =$quot"