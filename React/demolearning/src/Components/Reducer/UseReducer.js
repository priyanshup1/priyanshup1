import React, {useReducer} from 'react';

const initialstate = 0;
const reducer = (state,action) => {
  switch (action) {
      case 'increament':
          return state+1
      case 'decrement':
          return state-1
      case "reset":
          return initialstate
  }
}


const UseReducer = () => {
    const [count,dispatch] = useReducer(reducer,initialstate)
    return (

        <div>
            <br/>
            <br/>
            <div>{count}</div>
            <button onClick={()=>dispatch("increament")} > count ++ </button>
            <button onClick={()=>dispatch("decrement")} > count -- </button>
            <button onClick={()=>dispatch("reset")} > reset </button>
        </div>
    );
};

export default UseReducer;