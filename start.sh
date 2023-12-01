#!/bin/bash

echo "Checking frontend dependencies..."

sleep 2

cd ./src/frontend

if [ -d "node_modules" ]; then
    echo "Dependencies found!"
else
    echo "Dependencies missing!"
    echo "Installing dependencies..."

    sleep 2

    npm install
fi

echo "Checking backend dependencies..."

sleep 2

cd ../backend-and-api

if [ -d "target" ]; then
    echo "Dependencies found!"
else
    echo "Dependencies missing!"
    echo "Installing dependencies..."

    sleep 2

    ./mvnw dependency:resolve
fi

echo "Starting frontend server..."

sleep 2

cd ../frontend

# Run the Node.js app in the background
node app.js &

echo "Starting backend server..."

sleep 2

cd ../backend-and-api

./mvnw spring-boot:run

read -p "Press Enter to exit"
