read  -p "Enter a Number " num

if [[ $num =~ ^[0-9]{5}$ ]]; then
	sum=0
	
	for((i=0 ; i<5 ; i++)); do
	digit="${num:i:1}"
	sum=$((sum+digit))
done
echo $sum
else
echo "Invalid Input"
fi
