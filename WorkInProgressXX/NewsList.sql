CREATE TABLE Publisher (
    publisher_id INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE NewsGroup (
    news_group_id INT PRIMARY KEY,
    name VARCHAR(255)
);

CREATE TABLE NewsList (
    news_id INT PRIMARY KEY,
    title VARCHAR(255),
    content TEXT,
    published_date DATE,
    publisher_id INT,
    news_group_id INT,
    FOREIGN KEY (publisher_id) REFERENCES Publisher(publisher_id),
    FOREIGN KEY (news_group_id) REFERENCES NewsGroup(news_group_id)
);