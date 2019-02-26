#!/bin/bash


docker rmi -f $(docker images -q mysql-tdd | xargs)


docker build . -t mysql-tdd


docker run --rm -it -p 3307:3306 --name tdd mysql-tdd
