import {Component } from 'react';
import './Student.css'
import Course from '../course/Course';

class Student extends Component {
  state={
    st:'student information ',
    sid:'101',
    name:'shani mourya',
    email:'shani123@'
  }
 render(){
  
   return (
     <div className="mystudent">
        <h1>{this.state.st}</h1>
          <p>s_id :{this.state.sid}<br/> s_name:{this.state.name}<br/> s_email:{this.state.email}</p>
          
          <Course/>
     </div>
   );
 }
}

export default Student;