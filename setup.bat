:restart
@echo off
@ECHO ##########################################################################
@ECHO.
@ECHO  Gradle startup script for Windows
@ECHO  This is to prepare the source for use with an IDE.
@ECHO  Optionally you may compile the .jar as well.
@ECHO. 
@ECHO ##########################################################################

@ECHO Choose an IDE:
@ECHO [1] Eclipse
@ECHO [2] Idea (Intelij)
@ECHO [3] Build the source.
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

IF "%variable%"=="3" (goto build)

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
@ECHO  NOTICE: if you get an error asking you to select a deobfuscateor, you can find this in:
@ECHO  %USERPROFILE%/.gradle/caches/minecraft/net/minecraftforge/forge/FORGEVERSION/unpacked/conf
@ECHO.
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
@ECHO  NOTICE: if you get an error asking you to select a deobfuscateor, you can find this in:
@ECHO  %USERPROFILE%/.gradle/caches/minecraft/net/minecraftforge/forge/FORGEVERSION/unpacked/conf
@ECHO.
@ECHO  You may now exit this window.
@ECHO.
@ECHO ##########################################################################

pause

goto quit


:build
@echo on
start call gradlew build
@echo off
@ECHO.
@ECHO.
@ ECHO After the other window finishes, close it and
pause

@ECHO ##########################################################################
@ECHO.
@ECHO  To find the compiled jar file look in /build/lib
@ECHO.
@ECHO  You may now exit this window, or continue to go back to the main menu.
@ECHO.
@ECHO ##########################################################################

pause

goto restart


:quit

exit