#!/bin/sh
# does not really work
exec scala -cp "target/scala-2.12/docparser_2.12-0.1.0-SNAPSHOT.jar \
com.shmsoft.court.Application \
-i ../Greg_Data/NY_Court_2003-2015/txt -o ../Greg_Data/NY_Court_2003-2015/txt/parsed
