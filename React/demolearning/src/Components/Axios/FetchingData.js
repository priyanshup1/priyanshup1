import React, {useEffect, useState} from 'react';
import axios from "axios";

function FetchingData(props) {
    const [post, setPost]=useState([])
    useEffect(()=>
    {
        axios.get("https://jsonplaceholder.typicode.com/posts")
            .then(res=>{
                setPost(res.data)
            }).catch(err=>{
                console.log(err)
        },[])
    })
    return (
        <div>
            <ul>
                {
                    post.map(post=>
                    <li key={post.id}>{post.title}</li>)
                }
            </ul>
        </div>
    );
}

export default FetchingData;