
import { Component } from 'react';
import './Course.css';

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

  render() {
    let mycourseInfo = null;

    if (this.state.showCourse && this.props.mycid) {
      const { courseId, courseName, courseCost, courseTrainer } = this.props.mycid;

      mycourseInfo = (
        <div className="mycourse">
          <p>CourseId: {this.props.mycid.courseId}</p>
          <p>CourseName: {this.props.mycid.courseName}</p>
          <p>CourseCost: {this.props.mycid.courseCost}</p>
          <p>CourseTrainer: {this.props.mycidcourseTrainer}</p>
        </div>
      );
    }

    return (
      <div>
        <button className="mybutton" onClick={this.showCourseInfo}>
          CourseInfo
        </button>
        {mycourseInfo}
      </div>
    );
  }
}

export default Course;
