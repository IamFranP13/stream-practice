@echo off
if "%1"=="hide" (
    echo Ocultando soluciones...
    call mvn compile exec:java "-Dexec.args=hide"
) else if "%1"=="show" (
    echo Restaurando soluciones...
    call mvn compile exec:java "-Dexec.args=show"
) else (
    echo Uso: manage.bat [hide^|show]
    echo   hide - Oculta las soluciones para practicar
    echo   show - Restaura las soluciones originales
)
