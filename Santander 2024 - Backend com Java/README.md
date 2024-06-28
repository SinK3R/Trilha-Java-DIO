# Santander Dev Week 2023

Reprodução do Dio Lab "Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway", pela Digital Innovation One.

Java RESTful API criada para o Santander Dev Week.

## Diagrama de Classes

```mermaid
classDiagram
	direction TB
	class User {
		-String name
		-Account account
		-Feature[] features
		-Card card
		-News[] news
	}
	class Account {
		-String number
		-String agency
		-Number balance
		-Number limit
	}
	class Feature {
		-String icon
		-String description
	}
	class Card {
		-String number
		-Number limit
	}
	class News {
		-String icon
		-String description
	}
	User "1" *-- "1" Account
	User "1" *-- "N" Feature
	User "1" *-- "1" Card
	User "1" *-- "N" News

```
