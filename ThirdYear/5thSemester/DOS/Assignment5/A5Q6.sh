echo "Directories:"
for dir in */; do
    [ -d "$dir" ] && echo "$dir"
done

echo "Non-executable files:"
for file in *; do
    [ -f "$file" ] && [ ! -x "$file" ] && echo "$file"
done