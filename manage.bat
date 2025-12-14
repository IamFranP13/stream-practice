@echo off
if "%1"=="hide" (
    echo Hiding solutions...
    call mvn compile exec:java "-Dexec.args=hide"
) else if "%1"=="show" (
    echo Restoring solutions...
    call mvn compile exec:java "-Dexec.args=show"
) else (
    echo Usage: manage.bat [hide^|show]
    echo   hide - Hide solutions for practice
    echo   show - Restore original solutions
)
