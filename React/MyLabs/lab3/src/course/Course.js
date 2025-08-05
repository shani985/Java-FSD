import {Component } from 'react';
import './Course.css'

class Course extends Component {
  state={
    ct:'Course information ',
    cid:'102',
    cname:'react',
    cost:'15000',
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
      <p>CourseId:{this.state.cid}</p>
    <p>CourseName:{this.state.cname}</p>
   <p>CourseCost:{this.state.cost}</p>

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