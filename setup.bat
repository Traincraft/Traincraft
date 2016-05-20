@ECHO ##########################################################################
@ECHO
@ECHO  Gradle startup script for Windows
@ECHO
@ECHO ##########################################################################

@ECHO Choose an IDE:
@ECHO [1] Eclipse
@ECHO [2] Idea (Intelij)

if "%INPUT%"=="1" goto eclipse
else if "%INPUT%"=="eclipse" goto eclipse
else if "%INPUT%"=="Eclipse" goto eclipse

else if "%INPUT%"=="2" goto intelij
else if "%INPUT%"=="Intelij" goto intelij
else if "%INPUT%"=="intelij" goto intelij
else if "%INPUT%"=="idea" goto intelij
else if "%INPUT%"=="Idea" goto intelij




:eclipse
gradlew setupDecompWorkspace --refresh-dependencies
gradlew eclipse

@ECHO ##########################################################################
@ECHO
@ECHO  Mod is ready to be opened in Eclipse
@ECHO  NOTE: you must manually add the dependencies from the lib folder, aside from buildcraft, to your project structure
@ECHO
@ECHO ##########################################################################
pause
exit



:intelij
gradlew setupDecompWorkspace --refresh-dependencies
gradlew idea

@ECHO ##########################################################################
@ECHO
@ECHO  Mod is ready to be opened in Intelij/Idea
@ECHO  NOTE: you must manually add the dependencies from the lib folder, aside from buildcraft, to your project structure
@ECHO
@ECHO ##########################################################################
pause
exit