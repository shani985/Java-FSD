import {Component } from 'react';
import './App.css';
import Student from './student/Student';


class App extends Component {
  state={
    myheader:'welcome to shani mourya   '
  }
 render(){
  
   return (
     <div className="myheader">
          <p>{this.state.myheader} </p>
          <br/>
          <Student/>
        
          
    
     </div>
   );
 }
}

export default App;