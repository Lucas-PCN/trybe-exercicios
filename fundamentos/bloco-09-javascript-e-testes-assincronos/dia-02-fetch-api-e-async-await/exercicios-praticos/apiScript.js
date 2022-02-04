const API_URL = 'https://icanhazdadjoke.com/';

const fetchJoke = () => {
  const joke = document.querySelector('#jokeContainer');
  const myObject = {
    method: 'GET',
    headers: { 'Accept': 'application/json' }
  };

  fetch(API_URL, myObject)
    .then(response => response.json())
    .then(data => joke.innerHTML = data.joke);
};

window.onload = () => fetchJoke();