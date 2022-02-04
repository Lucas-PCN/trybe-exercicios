const API_URL = 'https://api.coincap.io/v2/assets';

async function getCoins() {
    const myUl = document.querySelector('#coinsList');

    const arrayCoins = await fetch(API_URL)
    .then(response => response.json())
    .then(data => data.data)
    .catch((error) => error.toString());

    return arrayCoins;
}

const setCoins = async() => {
    const myArray = await getCoins();

    const myList = document.querySelector('#coinsList');

    myArray.filter((_, index) => index < 10)
    .forEach((element) => {
        const newLi = document.createElement('li');
        const usdPrice = Number(element.priceUsd);
        newLi.innerHTML = `${element.id} (${element.symbol}): ${usdPrice.toFixed(2)}`;
        myList.appendChild(newLi);
    });
}

window.onload = () => setCoins();