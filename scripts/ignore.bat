@echo off

set RESULT="dir /b /s .\workspace\.metadata .\workspace\recommenders .\workspace\MJCompiler\bin .\workspace\MJCompiler\logs *.class .\workspace\MJCompiler\src\rs\ac\bg\etf\pp1\ast"

echo Stop tracking the following files:

for /f "tokens=*" %%i in (' %RESULT% ') do (echo 	%%i & git update-index --assume-unchanged %%i)

echo.
echo Done.