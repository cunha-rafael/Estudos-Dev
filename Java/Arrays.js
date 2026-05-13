const listaDoCasamento = ["Diva", "Flavia", "Ana", "Amanda", "Nubia", "Nagila", "Carlos", "Aline"];

console.log("Vou casar e os convidados são:", listaDoCasamento);
console.log("Quantas pessoas convidei?", listaDoCasamento.length);

console.log("Convidado numero 1:", listaDoCasamento[0]);
console.log("Convidado numero 8:", listaDoCasamento[listaDoCasamento.length - 1]);

console.log("Nubia esta em qual posicao do array?", listaDoCasamento.indexOf("Nubia"));

console.log(typeof listaDoCasamento);

listaDoCasamento.push("Julia");
listaDoCasamento.pop();


listaDoCasamento.unshift("Rafael");
listaDoCasamento.shift();

console.log("Nagila esta na lista?:", listaDoCasamento.includes("Nagila"));
