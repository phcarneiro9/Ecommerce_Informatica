# 🖥️ E-commerce Informática — API REST

API REST desenvolvida com **Java 17 e Spring Boot 3** para gerenciamento de clientes e pedidos de um e-commerce de informática.

## 🚀 Funcionalidades

### Clientes
- Criar, listar, buscar, atualizar e excluir clientes

### Pedidos
- Criar, listar, buscar, atualizar e excluir pedidos
- Pesquisa personalizada por cliente

## 🧩 Relacionamento

```text
Cliente 1 ──── N Pedido
```

## 🛠️ Tecnologias

- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate
- MySQL
- API REST
- Maven
- Insomnia

## 🔎 Exemplo de consulta

```http
GET /pedidos/pesquisa?cliente=Patrick
```

## ▶️ Como executar

```bash
git clone https://github.com/phcarneiro9/Ecommerce_Informatica.git
cd Ecommerce_Informatica
```

Configure o banco MySQL nas propriedades da aplicação e execute o projeto com Maven ou pela IDE.

## 🎯 Objetivo

Projeto desenvolvido para praticar **APIs REST, persistência de dados, relacionamentos entre entidades e consultas personalizadas** com Spring Boot.

## 👨‍💻 Autor

**Patrick Carneiro**

[GitHub](https://github.com/phcarneiro9)
