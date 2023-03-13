import React, {useEffect, useState} from 'react';
import axios from "axios";
import UseContxt from "../UseContext/UseContxt";

const FetchungDataById = () => {
    const [post,setPost] = useState({})
    const [id,setId] = useState(1)
    const [idbtn,setIdBtn] = useState(1)

    useEffect(()=>
    {
        axios.get(`https://jsonplaceholder.typicode.com/posts/${idbtn}`)
            .then(res=>
            {
                setPost(res.data)
            })
    },[idbtn])

    const buttonHandler = () => {
      setIdBtn(id)
    }
    const getidHandler = (e) => {
        setId(e.target.value)
    }
    return (
        <div>
            <br/>
            <br/>
            <label>enter the id to get the data....</label>
            <input type="text" value={id} onChange={getidHandler}/>
            <button onClick={buttonHandler}> Fetch Data</button>
            <br/>
            <h2>{post.title}</h2>
            <br/><br/>

        </div>
    );
};

export default FetchungDataById;