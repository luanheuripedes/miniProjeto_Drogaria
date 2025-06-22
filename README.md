# Sistema de Drogaria - Mini Projeto JSF

**Pequeno sistema de uma Drogaria desenvolvido para aprender JSF (JavaServer Faces)**

## Sobre o Projeto

Este é um projeto educacional que implementa um sistema básico de gerenciamento para uma drogaria/farmácia. O objetivo principal é estudar e praticar as tecnologias do ecossistema Java Web, especialmente o framework JSF.

## Tecnologias Utilizadas

- **Java** - Linguagem de programação principal
- **JSF (JavaServer Faces)** - Framework web para desenvolvimento da interface
- **PrimeFaces** - Biblioteca de componentes ricos para JSF
- **Maven** - Gerenciador de dependências e build
- **MySQL** - Sistema de gerenciamento de banco de dados
- **Hibernate/JPA** - Framework ORM para persistência de dados
- **Apache Tomcat** - Servidor de aplicação

## Funcionalidades

O sistema oferece as seguintes funcionalidades básicas:

### Gestão de Pessoas
- Cadastro de clientes
- Listagem e busca de pessoas
- Edição e exclusão de registros

### Gestão de Fabricantes
- Cadastro de fabricantes de medicamentos
- Listagem completa dos fabricantes
- Operações de CRUD (Create, Read, Update, Delete)

### Gestão de Produtos
- Cadastro de medicamentos e produtos
- Controle de estoque
- Vinculação com fabricantes
- Busca e filtragem de produtos

### Gestão de Vendas
- Registro de vendas
- Histórico de transações
- Relatórios básicos

## 🛠️ Como Executar o Projeto

### Pré-requisitos

Antes de executar o projeto, certifique-se de ter instalado:

- **JDK 8** ou superior
- **Maven 3.6** ou superior
- **MySQL Server 5.7** ou superior
- **Apache Tomcat 9** ou servidor compatível
- **IDE** (Eclipse, IntelliJ IDEA, NetBeans, etc.)

### Configuração do Banco de Dados

1. Crie um banco de dados MySQL:
```sql
CREATE DATABASE drogaria;
```

2. Configure as credenciais no arquivo de configuração da aplicação (persistence.xml ou arquivo de propriedades)

### Executando a Aplicação

1. **Clone o repositório:**
```bash
git clone https://github.com/luanheuripedes/miniProjeto_Drogaria.git
cd miniProjeto_Drogaria
```

2. **Compile o projeto:**
```bash
mvn clean compile
```

3. **Execute os testes (se disponíveis):**
```bash
mvn test
```

4. **Gere o arquivo WAR:**
```bash
mvn package
```

5. **Deploy no Tomcat:**
   - Copie o arquivo `.war` gerado na pasta `target/` para a pasta `webapps/` do Tomcat
   - Inicie o servidor Tomcat
   - Acesse: `http://localhost:8080/miniProjeto_Drogaria`

## Estrutura do Projeto

```
miniProjeto_Drogaria/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── br/com/drogaria/
│   │   │       ├── bean/          # Managed Beans (Controllers)
│   │   │       ├── dao/           # Data Access Objects
│   │   │       ├── domain/        # Entidades/Models
│   │   │       └── util/          # Classes utilitárias
│   │   ├── resources/
│   │   │   └── META-INF/
│   │   │       └── persistence.xml
│   │   └── webapp/
│   │       ├── pages/             # Páginas XHTML
│   │       ├── resources/         # CSS, JS, Imagens
│   │       ├── templates/         # Templates JSF
│   │       └── WEB-INF/
│   │           ├── web.xml
│   │           └── faces-config.xml
│   └── test/
│       └── java/                  # Testes unitários
├── pom.xml                        # Configurações Maven
└── README.md
```

## Conceitos Aprendidos

Este projeto aborda os seguintes conceitos importantes:

- **JSF Lifecycle** - Ciclo de vida das páginas JSF
- **Managed Beans** - Controladores da aplicação
- **Navigation** - Navegação entre páginas
- **Validation** - Validação de dados
- **Converters** - Conversão de dados
- **Templates** - Reutilização de layout
- **AJAX** - Requisições assíncronas
- **ORM** - Mapeamento objeto-relacional
- **DAO Pattern** - Padrão de acesso a dados
- **CRUD Operations** - Operações básicas de banco

## Recursos de Aprendizado

### Documentação Oficial
- [JavaServer Faces](https://javaee.github.io/javaserverfaces-spec/)
- [PrimeFaces](https://primefaces.org/)
- [Hibernate](https://hibernate.org/orm/documentation/)

### Tutoriais Recomendados
- Oracle JSF Tutorial
- PrimeFaces Showcase
- Hibernate Getting Started Guide

## Contribuições

Este é um projeto educacional, mas contribuições são bem-vindas! Se você encontrar bugs ou tiver sugestões de melhorias:

1. Faça um fork do projeto
2. Crie uma branch para sua feature (`git checkout -b feature/nova-funcionalidade`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova funcionalidade'`)
4. Push para a branch (`git push origin feature/nova-funcionalidade`)
5. Abra um Pull Request

## 📄 Licença

Este projeto é livre para uso educacional e está disponível sob a licença MIT.


Projeto desenvolvido como parte do aprendizado em tecnologias Java Web, especialmente JSF (JavaServer Faces).

---

**Desenvolvido por:** [luanheuripedes](https://github.com/luanheuripedes)

**Finalidade:** Projeto educacional para aprendizado de JSF
