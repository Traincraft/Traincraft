@ECHO OFF
@ECHO "|*************************************************************************************|"
@ECHO "|           Start to setup the dev environment for Traincraft 1.10.2                  |"
@ECHO "|*************************************************************************************|"
SET /P ANSWER="Are you using Eclipse?[Y/N]"

@ECHO ON
start call gradlew clean
start call gradlew setupDecompWorkspace --refresh-dependencies
@ECHO OFF

if /I "%ANSWER%" EQU "N" goto :idea
goto :eclipse

:eclipse
@ECHO ON
start call gradlew eclipse
@ECHO OFF
goto :end

:idea
@ECHO ON
start call gradlew idea
@ECHO OFF
goto :end

:end