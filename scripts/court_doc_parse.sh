#!/bin/sh
java -cp target/CourtDoc-1.0-SNAPSHOT-jar-with-dependencies.jar \
com.hyperiongray.court.Application \
-i ../court_docs/downloads/txt/ -o ../court_docs/downloads/parsed

java -cp target/scala-2.12/hello_2.12-0.1.0-SNAPSHOT.jar \
com.shmsoft.court.Application