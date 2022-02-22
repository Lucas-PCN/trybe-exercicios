import React from 'react';
import Pokedex from './Pokedex.js';
import './App.css';

class App extends React.Component {
  render() {
    return (
      <div className="App">
        <header>
          <h1>Pokedex</h1>
        </header>
        <Pokedex />
      </div>
    )
  }
}

export default App;
