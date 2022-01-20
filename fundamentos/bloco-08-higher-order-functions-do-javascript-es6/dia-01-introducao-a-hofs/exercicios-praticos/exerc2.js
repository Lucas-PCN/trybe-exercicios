const confereNumeros = (numeroApostado, numeroSorteado) => {
    if (numeroApostado === numeroSorteado) {
    return true;
    };
};

const sorteio = (numeroApostado, callback) => {
    const numeroSorteado = Math.floor((Math.random() * 5) + 1);
    let mensagem = '';

    if (callback(numeroApostado, numeroSorteado) === true) {
        mensagem = 'Parabéns você ganhou!';
    } else {
        mensagem = 'Tente novamente!';
    };
    return mensagem;
};

console.log(sorteio(3, confereNumeros));