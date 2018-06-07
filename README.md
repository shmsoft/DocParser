# This project is NOT IN USE and will be deleted soon

# DocParser

* This project has started its life as a Java project and was converted to a Scala one
    
## Capabilities

#### Pulling decisions from NY Courts of appeal
* Crawling all documents from the the 4 courts of appeal, downloading them and converting them from HTML to TXT
* Parsing the docs, to summarize for stats.
#### Parsing the text appeal documents, producing a csv file with extracted attributes

# How to run

## with sbt

To run, enter sbt. Once inside of sbt, do this

    sbt> run <your parameters>
    
On 'run' choice, chose '1' for Application
    
Parameters example

For all data

    -i ../Greg_Data/NY_Court_All -o  ../Greg_Data/NY_Court_All_Parsed

For a small test

    -i test-data/ny-appeals -o output
    
It will ask you which application to run, and pass your parameters to it

Please note that all software documentation is found in the 'doc' folder in this project

## Data

All input

../Greg_Data/NY_Court_All

Location on Google Drive:

https://drive.google.com/drive/u/1/folders/0B2J7VZ46YxKBR0RTc2FGWjlMOHM

Assuming that you have downloaded the data next to your project code

* ../Greg_Data/NY_Court_2017-09-10/courtdoc_2017.zip contains 12371 text files 
* ../Greg_Data/NY_Court_2017-09-10/courtdoc2015_2016.zip contains 36135 text files
* ../Greg_Data/NY_Court_2003-2015/txt contains 36135 text files 111019

(The first two files are from GDrive, the third one is from S3)
S3:

About 100K of appeal documents scraped from the NY State Court of appeals are found in S3 
[here](https://s3-us-west-2.amazonaws.com/darpa-memex/CourtDocs/court_documents.tar)

The (hopefully) latest results of processing, extracted with this CourtDoc regex's are 
[here](https://s3-us-west-2.amazonaws.com/darpa-memex/CourtDocs/CourtDocs-Output.zip)

#### Pulling data from California rehab institutions

(Kept as archive, probably to be removed)

## Useful Scala info

For packaging

[package plugin](https://github.com/sbt/sbt-native-packager)
[export Intellij configuration for sharing (by saving them in .idea in git)]

(https://intellij-support.jetbrains.com/hc/en-us/community/posts/206600965-Export-Import-Run-Configurations-)



    
