import React, {useState} from 'react';
import {Link} from "react-router-dom";

function Textbox(props) {
    const [Text,setTxst]=useState('')
    const [number,setNumber] = useState("")

    const HandlerOnChange = (event) => {
        console.log(event.target.value)
        setTxst(event.target.value)
    }

    const UpdateHandler = () => {
        let newval = Text.toUpperCase();
      setTxst(newval)
    }
    const LowerHandler = () => {
      setTxst(Text.toLowerCase())
    }
    const numberHandler = (event) => {
      setNumber(event.target.value)
    }
    const submitHandler = () => {
      const data = {
          textvalue:Text,
          numbervalue:number
        };
      console.log(data)
    }
    return (
        <div className="container">

            <h1>{props.title}</h1>
            <form onSubmit={submitHandler}>
            <textarea type="text" value={Text}  rows="8"  cols="99" onChange={HandlerOnChange}/>
            <input type="number" value={number} onChange={numberHandler}/>
        <div className="container ">
            <button onClick={UpdateHandler}>click toUppercase </button>
        </div>
            <div className="container ">
                <button onClick={LowerHandler}>click toLowercase</button>
            </div>
            <br/>
            <br/>
                <button type="submit">submittt</button>
            </form>
            <p>
                text:{Text}
                <br/>
                number:{number}
            </p>
        </div>


    );
}

export default Textbox;