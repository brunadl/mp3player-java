## MP3 Player

Um dos aparelhos eletrônicos que mais fez sucesso na primeira década dos anos 2000 foi o famigerado MP3 player. O aparelho trazia funções simples, como avançar, voltar, tocar, pausar, etc.
Vamos simular o funcionamento desse device em um programa feito em Java?
Ele deve conter as seguintes funções/métodos:

Nome:	exibeLista	<br>
    Recebe algo?	Recebe um vetor do tipo String <br>
		Retorna algo?	Não <br>
O que faz?	Exibe todos os elementos do vetor recebido, indicando também o número da música (ordem) dentro da lista <br>

Nome:	ativaShuffle <br>
    Recebe algo?	Não <br>
		Retorna algo?	Não <br>
O que faz?	Torna verdadeira ou falsa uma variável global chamada Shuffle que é do tipo boolean <br>

Nome:	avancarMusica	<br>
    Recebe algo?	Recebe um vetor do tipo String <br>
		Retorna algo?	Sim, uma String com o nome da música <br>
O que faz?	Caso a variável Shuffle esteja verdadeira, avança para uma posição aleatória dentro do vetor. Caso esteja falsa, avança para a próxima posição da lista. <br>

Nome:	voltarMusica <br>
    Recebe algo?	Recebe um vetor do tipo String <br>
		Retorna algo?	Sim, uma String com o nome da música <br>
O que faz?	Caso a variável Shuffle esteja verdadeira, volta para uma posição aleatória dentro do vetor. Caso esteja falsa, volta para a próxima posição da lista. <br>

Nome:	play <br>
    Recebe algo?	Recebe um vetor do tipo String <br>
		Retorna algo?	Sim, uma String com o nome da música <br>
O que faz?	Retorna uma string com a frase: “Tocando agora...”e o nome da música da posição atual. <br>

Nome:	stop	<br>
    Recebe algo?	Não <br>
		Retorna algo?	Sim, uma String <br>
O que faz?	Retorna uma string com a frase: “Parado”, e zera as variáveis responsáveis por controlar as posições, shuffle, etc. Apenas o vetor é mantido. <br>

Na main deve ser criado o vetor do tipo String que conterá o nome de 30 músicas (pode colocar diretamente no código, sem o usuário digitar). Fica ao seu encargo criar as outras variáveis dentro ou fora da main. <br>
<p> </p>
Crie também um pequeno menu que permita ao usuário escolher as diferentes funcionalidades.
