import React from "react"
import { hot } from "react-hot-loader/root"
import { Route, Switch, BrowserRouter, Redirect } from "react-router-dom"
import "regenerator-runtime/runtime"
import BookList from "./BookList.js"

const App = props => {
  return (
    <BrowserRouter>
          <Switch>
            <Route exact path="/books" component={BookList} />
          </Switch>
    </BrowserRouter>
  )
}
export default hot(App)
