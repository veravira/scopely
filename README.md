HW
======
## assignment 
## assignment  # 1 ##
1. Building a histogram
2. Building a recommendation of title likes

I used Pig Scripting to unwind the likes per UID (unique user identifier). I created two columns file, where the first column was the UID and second column was the title that corresponding UID liked, then I grouped data by the title column and displayed thE most frequent one.

I shipped data to Elasticsearch/Kibana for presentation tier. 
To Run Pig Script you need to either install elasticsearch and logstahs or, just store data locally instead shipping it to Elasticseach.

Please take a look at my power point presentation located at the root level - sample.pptx