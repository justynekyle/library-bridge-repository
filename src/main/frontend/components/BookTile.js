import React from "react"
import { Link } from "react-router-dom"

const BookTile = props => {
  const { title, author, genre, total_pages, isbn, rating } = props.book
  return (
      <div>
        <div>
          <div>
            <h1>{title}</h1>
          </div>
          <div>
            {author}
          </div>
          <br/>
        </div>
      </div>
  )
}

export default BookTile
