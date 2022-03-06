import React, { Component } from 'react';
import PersonCard from './PersonCard';

class App extends Component {
  constructor() {
    super();

    this.state = {
      loading: true,
      person: [],
    };
  }

  componentDidMount() {
    const url = 'https://api.randomuser.me/';
    fetch(url)
      .then((response) => response.json())
      .then((data) => {
        this.setState({
          person: data.results,
          loading: false,
        });
      });
  }

  shouldComponentUpdate(_nextProps, nextState) {
    const AGE = 50;
    if (nextState.person[0].dob.age > AGE) {
      return false;
    }
    return true;
  }

  getUserElements(user) {
    return {
      name: `${user.name.first} ${user.name.last}`,
      email: user.email,
      age: user.dob.age,
      image: user.picture.thumbnail,
    };
  }

  render() {
    const { person, loading } = this.state;
    const loadingElement = <span>Loading...</span>;

    if (loading) return loadingElement;
    return (
      <div>
        {person.map((currentPerson, index) => (
          <PersonCard key={ index } person={ this.getUserElements(currentPerson) } />))}
      </div>
    );
  }
}

export default App;