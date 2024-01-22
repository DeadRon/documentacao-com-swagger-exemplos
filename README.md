### Para utilizar Swagger no projeto é preciso
- [Criar um projeto no Spring no Spring Initializer](https://start.spring.io/)
Configurar:
- [adicionar dependência do maven](https://github.com/DeadRon/documentacao-com-swagger-exemplos/commit/19db008503063bcb46fdebfa22d35e5d1dc46a3b)
- [definição básica da api](https://github.com/DeadRon/documentacao-com-swagger-exemplos/commit/05dd0adcdba73cf0e5233fdde098e463d3fdbd32)

- **Usando Swagger**
	- Anotações importantes:
    - [**@Tag**](https://github.com/DeadRon/documentacao-com-swagger-exemplos/commit/a272e5e2908d03e9e6b5c12282eeef6d8fc4e2f4): agrupa as operações de api disponíveis no Controller no exemplo
    - [**@ApiResponses**](https://github.com/DeadRon/documentacao-com-swagger-exemplos/commit/234e107158a7377fdc9726ed2b8de08eb87f1ab2): anotação para especificar um conjunto de possíveis resposta de um endpoint de uma api, desde cenários de sucesso até cenários de falha. Recebe um array de @ApiResponse.() 
    - [**@ApiResponse**]: anotação usada para especificar cada cenário de sucesso e falha que um endpoint pode apresentar ao ser requisitado. Uma anotação @ApiResponses é um conjunto de anotações @ApiResponse.()
    - [**@Parameter**](https://github.com/DeadRon/documentacao-com-swagger-exemplos/commit/697ecb32a28b6bf043dce79a0cedd60bc899095d): documenta no swagger um parâmetro de requisição.()
    - [**@Parameters**](https://github.com/DeadRon/documentacao-com-swagger-exemplos/commit/6a237887780be5c694220163a08d5866d765810f): específica um conjunto de parâmetros (através de um array) de requisição (@Parameter) semelhante a relação @ApiResponses/@ApiResponse.()
