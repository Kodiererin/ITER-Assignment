echo '2. Write a shell script named as systeminfo that will display the information about the login
name of the user, name of the Unix system used by the user, type of the SHELL, Path of
current working directory of the user and list of file contain in current working directory.
(Make the script an executable file and run it as a command using its name only.)\n'


echo "User Name $(whoami) \n"
echo "Type of Shell Script  $(ps -p $$) \n"
echo "Unix type $(uname -a)"

