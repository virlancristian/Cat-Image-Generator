## Cat Image Generator 1.0.0

Cat Image Generator is a web app designed to interact with the CatAPI to get random cat images provided by the API through an user-friendly interface. 
The user can get random images by using the "Generate random image" button, by using the search field to get cat images based on a specific breed, or by providing the number of images(WIP)
The frontend is built in pure HTML + CSS + JavaScript and runs on a `Node.JS Express` server, and the backend and API of the web app is built in `Spring Boot`.

## Required 3rd party tools
For anyone who wants to run the app on their computer, the following 3rd party apps must be installed:

[Node.JS 20.8.1 and NPM](https://nodejs.org/dist/v20.8.1/)

[Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## Deployment
After you've cloned or downloaded the repo, you can access the `bash-scripts` directory to run the scripts for Windows or Linux (depending on what OS you use).

First you must install the dependencies required for the frontend and backend servers to work so run the `install-node-modules` and `install-maven-dependencies` scripts. 

After installing the dependencies, you can run the frontend and backend servers by running the `start-frontend-server` and `start-backend-server` scripts.

After launching the app, you can access the web page on `localhost:3000` or interact with the built-in API on `localhost:8080`

## App docs
[Design of the web page](https://github.com/virlancristian/Cat-Image-Generator/pull/1)

[Backend and API](https://github.com/virlancristian/Cat-Image-Generator/pull/2)

[Interaction between frontend and backend](https://github.com/virlancristian/Cat-Image-Generator/pull/3)

[Bash scripts](https://github.com/virlancristian/Cat-Image-Generator/pull/4)

## 3rd party tools docs

[Node.JS 20.8.1](https://nodejs.org/dist/v20.8.0/docs/api/)

[Express 4](https://expressjs.com/en/4x/api.html)

[Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
