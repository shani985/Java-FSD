import {Component } from 'react';
import './App.css';
import Student from './student/Student';


class App extends Component {
  state={
    myheader:'welcome to shani mourya',
    Student:{
    st:'student information ',
    sid:'101',
    name:'shani mourya',
    email:'shani123@',
    phone:'9258430178',
    city:'bareilly',
    course:{
      courseId:"C-1",
      courseName:"React",
      price:15000,
      trainer:"srinivas"
    }
  },
  }
 render(){
  
   return (
     <div className="myheader">
          <p>{this.state.myheader} </p>
          <br/>
          <p>{this.state.Student.st}</p>
          <Student mystudent={this.state.Student}/>
        
          
    
     </div>
   );
 }
}

export default App;