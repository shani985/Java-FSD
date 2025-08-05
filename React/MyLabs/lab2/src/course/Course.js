import {Component } from 'react';
import './Course.css'

class Course extends Component {
  state={
    ct:'Course information ',
    cid:'102',
    cname:'react',
    cost:'15000'
  }
 render(){
  
   return (
     <div className="mycourse">
        <h2>{this.state.ct}</h2>
          <p>c_id :{this.state.cid}<br/> c_name:{this.state.cname}<br/> cost:{this.state.cost}</p>
          
    
     </div>
   );
 }
}

export default Course;