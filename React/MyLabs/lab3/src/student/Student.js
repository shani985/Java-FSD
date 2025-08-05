import {Component } from 'react';
import './Student.css'
import Course from '../course/Course';

class Student extends Component {
  state={
    st:'student information ',
    sid:'101',
    name:'shani mourya',
    email:'shani123@',
    showStudent:false,
  }
  showStudent=()=>{
    let currentFlag=this.state.showStudent;
     this.setState({
    showStudent:!currentFlag

  });

  }

 render(){
  let mystudentInfo=null;
  if(this.state.showStudent===true){
  mystudentInfo=(
    <div className="mystudent">
      <p>studentId:{this.state.sid}</p>
      <p>studentNamw:{this.state.name}</p>
      <p>studentEmail:{this.state.email}</p>
      <Course/>
    </div>
  );
}
  
  
   return (
     <div  >
       <button className='mybutton' onClick={this.showStudent}>StudentInfo</button>
        {mystudentInfo}
        
     </div>
   );
 }
}

export default Student;