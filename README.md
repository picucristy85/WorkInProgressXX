# WorkInProgressXX
WorkInProgressXX is an Web API to parse an RSS
This is an Web API to parse an RSS (https://rss.nytimes.com/services/xml/rss/nyt/World.xml). 
It will:
    a) Create a Page/API for returning news list sorted by publication date asc/desc or title alphabetically asc/desc. Sort parameter should be part of the request. News returned should contain: title, link, description, publication date).
    b) give the possibility to search for a keyword in the news list and return the news containing the searched word
    c) give the possibility to save the news list in a database (create datamodel - news, publisher, news_group, etc. and save to DB).
