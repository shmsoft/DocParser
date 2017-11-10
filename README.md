# DocParser

* This project has started its life as a Java project and was converted to a Scala one
    
## Capabilities

#### Pulling decisions from NY Courts of appeal
* Crawling all documents from the the 4 courts of appeal, downloading them and converting them from HTML to TXT
* Parsing the docs, to summarize for stats.
#### Parsing the text appeal documents, producing a csv file with extracted attributes

To run the application(s), look into the 'scripts' folder

Please note that all software documentation is found in the 'doc' folder in this project

## Data

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

    