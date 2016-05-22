@echo on
@ECHO ##########################################################################
@ECHO
@ECHO  Gradle startup script for Windows
@ECHO
@ECHO ##########################################################################

@ECHO Choose an IDE:
@ECHO [1] Eclipse
@ECHO [2] Idea (Intelij)
@ECHO 
@ECHO 
:tryagain
@echo off
set /p variable=""
IF "%variable%"=="1" (goto eclipse)
IF "%variable%"=="eclipse" (goto eclipse)
IF "%variable%"=="Eclipse" (goto eclipse)

IF "%variable%"=="2" (goto intelij)
IF "%variable%"=="Intelij" (goto intelij)
IF "%variable%"=="intelij" (goto intelij)
IF "%variable%"=="idea" (goto intelij)
IF "%variable%"=="Idea" (goto intelij)

pause
@echo on
@ECHO Incorrect option, try again.
goto tryagain



:eclipse
@echo on
@ECHO ##########################################################################
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
@echo on
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