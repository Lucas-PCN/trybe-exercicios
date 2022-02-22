import React from 'react';
import pokemons from './data';
import Pokemon from './Pokemon'

class Pokedex extends React.Component {
  render() {
    return (
      <div className="pokedex">
        {pokemons.map((element) => (
          <Pokemon key={ element.id } pokemon={ element } />
        ))}
      </div>
    )
  }
}

export default Pokedex;
