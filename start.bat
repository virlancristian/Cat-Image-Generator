@echo off

echo Checking frontend dependecies...

timeout /nobreak /t 2 > nul

cd ./src/frontend

if exist node_modules (
    echo Dependencies found!
) else (
    echo Dependencies missing!
    echo Installing dependencies...

    timeout /nobreak /t 2 > nul

    npm install
)

echo Checking backend dependencies...

timeout /nobreak /t 2 > nul

cd ../backend-and-api

if exist target (
    echo Dependencies found!
) else (
    echo Dependencies missing!
    echo Installing dependencies...

    timeout /nobreak /t 2 > nul

    call mvnw dependency:resolve
)

echo Starting frontend server...

timeout /nobreak /t 2 > nul

cd ../frontend

start cmd /k "node app.js"

echo Starting backend server...

timeout /nobreak /t 2 > nul

cd ../backend-and-api

call mvnw spring-boot:run

pause