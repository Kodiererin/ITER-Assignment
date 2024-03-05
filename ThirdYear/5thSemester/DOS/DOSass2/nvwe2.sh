filename="$1"

line_count=$(wc -l "$filename" | awk '{print $1}')
word_count=$(wc -w "$filename" | awk '{print $1}')
char_count=$(wc -m "$filename" | awk '{print $1}')

echo "filename linecount wordcount charcount"
echo "$filename $line_count $word_count $char_count"
