import React, {useEffect, useState} from 'react';

function ObjectStates(props) {
    const [Name,setName]=useState({firstname:'',lastname:''})
    const [count,setCount] = useState(0)

    useEffect(()=> {
        document.title= `count ${count}`
        }
    )
    const firstnameHandler = (event) => {
      setName({...Name,firstname: event.target.value})

    }
    const lastnameHandler = (event) => {
        setName({...Name,lastname:event.target.value})
    }
    const counterHandler = () => {
      setCount(count+1)
    }
    return (
        <div>
            <h1>{props.title}</h1>
            <br/>
            <button onClick={counterHandler}>count {count}</button>
            <form>
            <input type="text" value={Name.firstname} onChange={firstnameHandler}/>
            <input type="text" value={Name.lastname} onChange={lastnameHandler}/>
            <div>
                1st name :
                <br/>
                last name : {Name.lastname}
            </div>
            </form>
        </div>
    );
}

export default ObjectStates;