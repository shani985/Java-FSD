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
    course:{
      courseId:"C-1",
      courseName:"React",
      price:15000,
      trainer:"srinivas"
    }
  }
  // showStudent=()=>{
  //   let currentFlag=this.state.showStudent;
  //    this.setState({
  //   showStudent:!currentFlag

  // });

  // }

 render(){
  
   return (
     <div  >
       {/* <button className='mybutton' onClick={this.showStudent}>StudentInfo</button> */}
         <div className="mystudent">
      <p>studentId:{this.state.sid}</p>
      <p>studentNamw:{this.state.name}</p>
      <p>studentEmail:{this.state.email}</p>
      <Course mycid={this.state.course.courseId}
      mycname={this.state.course.courseName}
      mycprice={this.state.course.price}
      myctrainer={this.state.course.trainer}/>
    </div>
        
     </div>
   );
 }
}

export default Student;