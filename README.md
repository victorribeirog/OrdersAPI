# OrdersAPI

OrdersAPI é um microserviço desenvolvido para processar pedidos, gerar relatórios e fornecer uma API REST para consultas relacionadas a pedidos e clientes. O projeto também implementa a funcionalidade adicional de calcular o valor total de todos os pedidos realizados por cliente.

---

## ✨ Funcionalidades

1. **Processamento de Pedidos**
   - Consome mensagens de uma fila RabbitMQ com informações de pedidos.

   ![OrderAPI](assets/img_3.png)

   - Persiste os dados em uma base MongoDB para consulta posterior.

     ![OrderAPI](assets/img_1.png)

1. **API REST**
   - Listagem de pedidos por cliente.
   - Consulta do valor total de todos os pedidos de um cliente.

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem de Programação**: Java 21  
- **Banco de Dados**: MongoDB  
- **Mensageria**: RabbitMQ  
- **Contêineres**: Docker  

---

## 📃 Endpoint da API

### **Listagem de Pedidos por Cliente**
- **GET** `/customers/{customerId}/orders`  
- **Descrição**: Lista os pedidos realizados por um cliente, incluindo o valor total de todos os pedidos.
![OrderAPI](assets/img.png)


---

## 🛠️ Estrutura do Projeto

```plaintext
src/
├── controller/     # Controladores para a API REST
├── service/        # Lógica de negócios
├── repository/     # Camada de acesso aos dados (MongoDB)
├── config/         # Configurações (RabbitMQ, MongoDB)
├── model/          # Classes de modelo (Pedido, Cliente, etc.)
├── dto/            # Objetos de Transferência de Dados (Request/Response)
└── ...             # Outros diretórios auxiliares
```

--- 

💻 Desenvolvido por [Victor Ribeiro](https://github.com/victorribeirog).
