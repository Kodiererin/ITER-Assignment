main(){
    employees=10
    for((i=1;i<=$employees;i++)) do
    read -p "Enter the Working Hours of employee $i:" HoursWorked
    overtimePay=$(calculatOvertimePay $HoursWorked)

    echo "Overtime Pay of employee $i is $overtimePay"
    done
}

calculatOvertimePay() {
    totalHour=40
    hourlyRate=12.00

    if (($1 > totalHour)); then
        overTimeHour=$(($1 - totalHour))
        overtimePay=$(echo "scale=2; $overTimeHour * $hourlyRate" | bc)
        echo $overtimePay
    else
        echo "0"
    fi  
}

main