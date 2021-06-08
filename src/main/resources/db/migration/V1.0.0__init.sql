DROP TABLE IF EXISTS books CASCADE;
CREATE TABLE books (
  id SERIAL PRIMARY KEY,
  title VARCHAR (200) NOT NULL,
  author VARCHAR (200) NOT NULL,
  genre VARCHAR (50) NOT NULL,
  total_pages INTEGER NOT NULL,
  isbn VARCHAR(255) NOT NULL,
  rating INTEGER NOT NULL
);

INSERT INTO books (title, author, genre, total_pages, isbn, rating) VALUES ('Book1', 'Author1', 'Comedy', 200, '1234567891234', 70);