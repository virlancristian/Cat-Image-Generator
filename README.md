## Cat Image Generator 1.1.0

Cat Image Generator is a web app designed to interact with the CatAPI to get random cat images provided by the API through an user-friendly interface. 
The frontend is built in pure HTML + CSS + JavaScript and runs on a `Node.JS Express` server, and the backend and API of the web app is built in `Spring Boot`.

## Table of contents
- [Relase notes and documentation](#release-notes-and-documentation)
- [Former relase notes](#former-relase-notes)
- [Required 3rd party tools](#required-3rd-party-tools)
- [Deployment](#deployment)
- [App docs](#app-docs)
- [3rd party tools docs](#3rd-party-tools-docs)

## Release notes and documentation
[Click here](https://github.com/virlancristian/Cat-Image-Generator/pull/8)

## Former relase notes
- [Relase 1.0.0](https://github.com/virlancristian/Cat-Image-Generator/pull/6)

## Required 3rd party tools
For anyone who wants to run the app on their computer, the following 3rd party apps must be installed:

[Node.JS 20.8.1 and NPM](https://nodejs.org/dist/v20.8.1/)

[Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## Deployment
After you've cloned or downloaded the repo, you must provide an API key from the CatAPI to the backend application.

To do this, first you must get an API [key](https://thecatapi.com/#pricing) and then place the key into `./src/backend-and-api/src/main/resources/application.properties`
file in the `api.token` field.

After completing this step, you can start your app by starting the `start.bat` file if you are on Windows or `start.sh` if you are on Linux but before this run the following script in the root directory:
```bash
chmod +x start.sh
```
To grant access to the start script

## App docs
[Design of the web page](https://github.com/virlancristian/Cat-Image-Generator/pull/1)

[Backend and API](https://github.com/virlancristian/Cat-Image-Generator/pull/2)

[Interaction between frontend and backend](https://github.com/virlancristian/Cat-Image-Generator/pull/3)

[Bash scripts](https://github.com/virlancristian/Cat-Image-Generator/pull/4)

## 3rd party tools docs

[CatAPI](https://developers.thecatapi.com/view-account/ylX4blBYT9FaoVd6OhvR?report=bOoHBz-8t)

[Node.JS 20.8.1](https://nodejs.org/dist/v20.8.0/docs/api/)

[Express 4](https://expressjs.com/en/4x/api.html)

[Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
