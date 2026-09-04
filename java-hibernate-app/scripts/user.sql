-- Drop user first if they exist
DROP USER if exists 'springtutorial'@'%' ;

-- Now create user with prop privileges
CREATE USER 'springtutorial'@'%' IDENTIFIED BY 'springtutorial';

GRANT ALL PRIVILEGES ON * . * TO 'springtutorial'@'%';