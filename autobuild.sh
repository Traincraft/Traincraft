#!/bin/bash

timestamp() {
  date +'%Y-%m-%d'
}


[ "$(ls -A ./build/libs)" ] && echo "Clearing Old Builds"
rm -f ./build/libs/*
chmod +x ./gradlewLinux
./gradlewLinux setupDecompWorkspace --refresh-dependencies build
mkdir -p ./builds
mv ./build/libs/*.jar ./builds/TiM-Experimental-$(timestamp).jar
exit
