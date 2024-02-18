read  -p "Enter the Day " day

case "$day" in
    #case1 
    "Monday") echo "DOS Class is at 9am, at E-405";;
    "Tuesday") echo "DOS Class is at 10am, at E-221";;
    "Wednesday") echo "DOS Class is at 9pm, at E-322";;
    "Thursday") echo "DOS Class is at 9pm, at E-405";;
    "Friday") echo "DOS Class is at 9pm, at E-221";;
    "Saurday") echo "DOS Class is at 9pm, at E-322";;
    "Sunday") echo "No Class";;
esac
