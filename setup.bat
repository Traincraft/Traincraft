@echo off
@ECHO ##########################################################################
@ECHO.
@ECHO  Gradle startup script for Windows
@ECHO  This is to prepare the source for use with an IDE.
@ECHO  This is NOT for compiling the program. Use the IDE for that.
@ECHO. 
@ECHO ##########################################################################

@ECHO Choose an IDE:
@ECHO [1] Eclipse
@ECHO [2] Idea (Intelij)
@echo off
@ECHO.
@ECHO. 
:tryagain
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
@ECHO Incorrect option, try again.
goto tryagain



:eclipse
@echo on
start call gradlew setupDecompWorkspace --refresh-dependencies
@echo off
@ECHO.
@ECHO.
@ ECHO After the other window finishes, close it and
pause
@echo on
start call gradlew eclipse
@echo off
@ECHO.
@ECHO.
@ ECHO After the other window finishes, close it and
pause

@ECHO ##########################################################################
@ECHO.
@ECHO  Mod is ready to be opened in Eclipse.
@ECHO  You may open the project via gradle or directory import.
@ECHO  You may now exit this window.
@ECHO.
@ECHO ##########################################################################

pause

goto quit


:intelij
@echo on
start call gradlew setupDecompWorkspace --refresh-dependencies
@echo off
@ECHO.
@ECHO.
@ ECHO After the other window finishes, close it and
pause
@echo on
start call gradlew idea
@echo off
@ECHO.
@ECHO.
@ ECHO After the other window finishes, close it and
pause

@ECHO ##########################################################################
@ECHO.
@ECHO  Mod is ready to be opened in Intelij/Idea.
@ECHO  You may open the project via gradle import or via: Traincraft-5.ipr
@ECHO  You may now exit this window.
@ECHO.
@ECHO ##########################################################################

pause

goto quit



:quit

