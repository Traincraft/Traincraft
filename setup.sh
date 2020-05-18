JAVA_VER=$(javac -version 2>&1 | sed -n ';s/.* version "\(.*\)\.\(.*\)\..*"/\1\2/p;')

echo "JDK version found was:"
echo "$JAVA_VER"


if [ "$JAVA_VER" -ge 19 ]
then
    echo "This version is incompatible, 1.9 and later break stuff."
    ins_j8;;
elif [ -z "$JAVA_VER" ]
then
    ins_j8;;
elif [ ! "$JAVA_VER" -ge 18 ]
then
    echo "your java version is too old and doesn't support the methods we need."
    insj8;;
fi




JAVA_VER=$(javac -version 2>&1 | sed -n ';s/.* version "\(.*\)\.\(.*\)\..*"/\1\2/p;')
if [ "$JAVA_VER" -ge 18 ]
then
    printf '%*s\n' "${COLUMNS:-$(tput cols)}" '' | tr ' ' -

    echo "Choose an option:"
    echo "1: Setup workspace for eclipse (partial setup)."
    echo "2: Setup workspace for Intelij IDEA."
    echo "3: Compile a jar of the mod."

    read -p "" choice
    case "$choice" in
        1 )
            echo "Setting up workspace for Eclipse"
            ./gradlewLinux setupDecompWorkspace --refresh-dependencies eclipse

            ;;
        2 )
            echo "Setting up workspace for Intelij"
            ./gradlewLinux setupDecompWorkspace --refresh-dependencies idea

            ;;
        3 )
            echo "Attempting to build jar file"
            ./gradlewLinux setupDecompWorkspace --refresh-dependencies build

            ;;


        * ) echo "invalid answer";;
    esac


fi






ins_j8() {
    read -p "Install Oracle Java Development Kit (JDK) 1.8 (y/n)?" choice
    case "$choice" in
        y|Y )
            echo "Installing Oracle JDK 18."
            sudo add-apt-repository ppa:webupd8team/java
            sudo apt-get update
            sudo apt-get install oracle-java8-installer
            ;;
        n|N )
            echo "Exiting"
            [[ "$0" = "$BASH_SOURCE" ]] && exit 1 || return 1;;
        * ) echo "invalid answer";;
    esac


}
