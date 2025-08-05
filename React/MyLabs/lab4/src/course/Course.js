import {Component } from 'react';
import './Course.css'

class Course extends Component {
  state={
    showCourse:false,
   
  }
  showCourseInfo=()=>{
  let currentFlag=this.state.showCourse; 
  //do not  mutate state  directly.use setstatemethod()
  //this.state/showCaurse=!courseFlag: do not do this
  this.setState({
    showCourse:!currentFlag

  });
}

 render(){
  let mycourseInfo=null;
  if(this.state.showCourse===true){
  mycourseInfo=(
    <div className="mycourse">
      <p>CourseId:{this.props.mycid}</p>
    <p>CourseName:{this.props.mycname}</p>
   <p>CourseCost:{this.props.mycprice}</p>
   <p>CourseTrainer:{this.props.myctrainer}</p>

   </div>
  

  );
}
   return (
   <div>
    <button className='mybutton' onClick={this.showCourseInfo}
    >CourseInfo</button>
     {mycourseInfo}
   </div>


   );
 
}
}

export default Course;