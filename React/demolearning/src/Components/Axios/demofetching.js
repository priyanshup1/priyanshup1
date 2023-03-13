import React, {useEffect, useState} from 'react';
import axios from "axios";

const Demofetching = () => {
    const [comment,setComment] = useState([])
    useEffect(()=>
    {
        axios.get("https://jsonplaceholder.typicode.com/albums")
            .then(res=>
            {
                console.log(res.data)
                setComment(res.data)
            })
            .catch(err=>
            {
                console.log(err)
            })
    },[1])
    return (
        <div>
            {/*<ul>{*/}
            {/*    comment.map(comment=> [*/}
            {/*        <li key={comment.id}>{comment.id}</li>,*/}
            {/*        <li>{comment.title}</li>*/}
            {/*    ])*/}
            {/*}</ul>*/}
            <table>
                <tr><th>id</th>  <th>title</th></tr>
                <td>{
                    comment.map(comment=>
                        <tr key={comment.id}>{comment.id}</tr>)}
                </td>

                <td>{
                    comment.map(comment=>
                    <tr key={comment.id}>{comment.title}</tr>)}
                </td>

            </table>

        </div>
    );
};

export default Demofetching;