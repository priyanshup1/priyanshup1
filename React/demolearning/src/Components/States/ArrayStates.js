import React, {useState} from 'react';

const ArrayStates = (props) => {
    const [items,setItems]=useState([])
    const additemHandler = () => {
      setItems([...items,
          {
              id:items.length,
              value: Math.floor(Math.random()*10)+1
          }])
    }
    return (
        <div>
            <br/>
            <h1>{props.title}</h1>
            <br/>
            <button onClick={additemHandler}>add number</button>
            <ul>
                {items.map(item => ( <li key={item.id}>{item.value}</li>))}

            </ul>
        </div>
    );
};

export default ArrayStates;