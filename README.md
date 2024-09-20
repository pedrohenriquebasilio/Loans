
# Loans

## Descrição

O projeto **Loans** é uma aplicação Java baseada em Spring Boot para o gerenciamento de empréstimos. Ele permite o cadastro temporário de clientes e o registro de empréstimos, com cálculos automáticos de juros e prazos. O sistema foi criado como um exemplo de aplicação de APIs REST usando validação e serviços no Spring Boot.

## Funcionalidades

- **Cadastro de Clientes**: Permite adicionar novos clientes.
- **Registro de Empréstimos**: Calcula automaticamente os juros e permite o registro de empréstimos para clientes.
- **Exceções Personalizadas**: Gerenciamento de erros como falta de disponibilidade de empréstimos por meio de exceções específicas.
- **Validação de Dados**: Uso de validações de entrada nos endpoints.

## Tecnologias Utilizadas

- **Java 21**: Linguagem principal.
- **Spring Boot**: Framework para construção da aplicação.
- **Spring Boot Starter Validation**: Para validação de dados.
- **JUnit**: Para testes unitários.
- **Maven**: Para gerenciamento de dependências.

## Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/pedrohenriquebasilio/Loans.git
   ```

2. Navegue até o diretório do projeto:
   ```bash
   cd Loans
   ```

3. Compile e execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

4. A aplicação estará disponível em `http://localhost:8080`.

## Como Usar

### Cadastro de Clientes

- Endpoint: `POST /clientes`
- Exemplo de JSON para cadastro:
  ```json
  {
    "name": "João Silva",
    "cpf": "123.456.789-00",
    "income": 5000.00,
    "location": "SP"
  }
  ```

### Registro de Empréstimo

- Endpoint: `POST /loans`
- Exemplo de JSON para registrar um empréstimo:
  ```json
  {
    "clientCpf": "123.456.789-00",
    "loanAmount": 10000.00,
    "interestRate": 1.5,
    "months": 12
  }
  ```

### Exceções

O sistema lança exceções personalizadas como `LoanNotAvaliableException` para gerenciar situações como falta de disponibilidade de empréstimos.

## Estrutura do Projeto

- **LoanController.java**: Controlador REST que expõe os endpoints para operações com clientes e empréstimos.
- **LoanService.java**: Serviço responsável pela lógica de negócio, como cálculos de juros e verificação de disponibilidade de empréstimos.
- **Customer.java**: Entidade que representa um cliente.
- **Loan.java**: Entidade que representa um empréstimo.
- **CustomerLoanRequest.java** e **CustomerLoanResponse.java**: DTOs usados para gerenciar as requisições e respostas no registro de empréstimos.
- **LoanType.java**: Enum que define os tipos de empréstimos disponíveis.
- **LoanNotAvaliableException.java**: Exceção personalizada para lidar com erros específicos de empréstimos indisponíveis.

## Futuras Implementações

- Persistência de dados usando JPA e um banco de dados MySQL.
- Implementação de autenticação e autorização.
- Criação de relatórios de status de empréstimos.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

## Licença

Este projeto está licenciado sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
