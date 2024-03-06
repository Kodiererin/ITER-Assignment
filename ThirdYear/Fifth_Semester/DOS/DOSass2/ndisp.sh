n="$1"
m="$2"
filename="$3"

head -n "$n" "$filename"
tail -n "$m" "$filename"
