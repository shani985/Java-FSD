import { Component } from 'react';
import './Student.css';
import Course from '../course/Course';

class Student extends Component {
  render() {
     
//flow APP=>Student.js=>course.js this is a flowof data
    // Logging city outside JSX (this is okay)
    console.log(this.props.mystudent.city);

    return (
      <div>
        {/* Student Info */}
        <div className="mystudent">
          <p>studentId: {this.props.mystudent.sid}</p>
          <p>studentName: {this.props.mystudent.name}</p>
          <p>studentEmail: {this.props.mystudent.email}</p>
          <p>studentPhone: {this.props.mystudent.phone}</p>
          <p>studentCity: {this.props.mystudent.city}</p>

          {/* Course component with student’s course info */}
          <Course mycid={this.props.mystudent.course} />
        </div>
      </div>
    );
  }
}

export default Student;
