import './App.css';
import {BrowserRouter as Router, Link, Route, Routes} from 'react-router-dom';

import Textbox from "./Components/States/Textbox";
import ObjectStates from "./Components/States/ObjectStates";
import ArrayStates from "./Components/States/ArrayStates";
import FetchingData from "./Components/Axios/FetchingData";
import React, {createContext} from "react";
import Demofetching from "./Components/Axios/demofetching";
import FetchungDataById from "./Components/Axios/FetchungDataById";
import UseReducer from "./Components/Reducer/UseReducer";

// export const playerContext = createContext("aj Styles");
// export const typeContext = createContext("wrestling");
function App() {


  return (
    <div className="App">
      <Router>
          <br/>
          <br/>
          <Link to="/fetchingdata"> Axios topic</Link>
          <br/>
          <Link to="/objectstates"> Object States topic</Link>
          <br/>
          <Link to="/arraystates"> Array states topic</Link>
          <br/>
          <Link to="/demofetching"> demo fetching</Link>
          <br/>
          <Link to="/getbyid">fetching data by Id</Link>
          <br/>
          <Link to="/reducer">Testing reducer</Link>
          <Routes>
              <Route path="/objectstates" element={<ObjectStates/>}/>
              <Route path="/arraystates" element={<ArrayStates/>}/>
              <Route path="/fetchingdata" element={<FetchingData/>}/>
              <Route path="/demofetching" element={<Demofetching/>}/>
              <Route path="/getbyid" element={<FetchungDataById/>}/>
              <Route path="/reducer" element={<UseReducer/>}/>
          </Routes>
      </Router>
    </div>
  );
}

export default App;
