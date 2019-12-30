import React, { Component }  from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
// import './App.css';

class App extends Component {
    constructor(props) {
      super(props);
      this.state = {
        items:[]
      }
      this.loadData = this.loadData.bind(this)

    }
    componentDidMount() {
      this.loadData()
      setInterval(this.loadData, 15000);
    }

    async loadData() {
      fetch('/nba',  {
        headers: {
          "Access-Control-Allow-Origin": "*"
        }
      })
        .then(response => {
          return response.json();
        })   
        .then((data) => {
          for (let i = 0; i < data.length; i++) {
            this.setState({
              items: data.map(item => ({
                live: item.isGameActivated,
                team1Name: item.team1Name,
                team1Score: item.team1Score,
                team2Name: item.team2Name,
                team2Score: item.team2Score
              }))
            });
            console.log(data[i])
          }
        });      
    }
    
    render() {
      return (
        <div class="container container-table">
 
            <h1>Live NBA scores</h1>
              {this.state.items.map((item, i) => (
                  <ul key={i}>{item.team1Name} ({item.team1Score}) - {item.team2Name} ({item.team2Score})  -- <font color ={item.isGameActivated ? 'green' : 'red'}>Live{item.isGameActivated} </font></ul>
              ))}

       </div>
      );
    }
  
  }
export default App;
