var express = require('express'); //todos os métodos/funções do plugin estão na variável (como um objeto)
var app = express(); //variável app é do tipo express

//rotas da api
app.get('/dados',function(req,res){
	 res.send({ //o response está sendo uma json, mas pode ser array, string, etc..
	 	nome: "João Silva",
	 	idade: 20,
	 	sexo: "Masculino"
	 });
});
app.get('/outra-rota',function(req,res){
	res.send("Hello World");
});

app.listen(3000,function(){ //3000 é a porta
	console.log("API rodando na porta 3000");
});