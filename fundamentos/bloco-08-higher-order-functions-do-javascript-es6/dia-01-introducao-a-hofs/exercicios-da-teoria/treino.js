const wakeUp = () => {
    return('Acordando!!');
}

const letsEat = () => {
    return('Bora tomar café!!');
}

const sleep = () => {
    return('Partiu dormir!!');
}

function doingThings (callBack) {
    console.log(callBack());
}

doingThings(wakeUp);
doingThings(letsEat);
doingThings(sleep);
