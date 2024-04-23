# Objetivo do código

Demonstração de uso de banco de dados mysql com java de forma mais simples e precisa possível.

# Instruções de código

Em src/Main.java está a raiz do nosso projeto, neste arquivo está a classe raiz Main e uma classe auxiliar de teste chamada Test.

Observe que na classe Test tem duas funções públicas:

- testInsertUser: insere um usuário de teste.
- testListUser: lista os usuário inseridos.

Você pode usar estas duas funções na função main da classe Main para executar testes como por exemplo:

```
public class Main {
    public static void main(String[] args) throws Exception {
        Test.testListUser();
    }
}
```

# Lib mysql

uma biblioteca de conexão mysql necessária acompanha este projeto na pasta lib

# docker

Um container desenvolvido em docker acompanha este projeto no arquivo docker-compose.yml, esse tem como propósito fornecer um container de banco de dados já
pronto para teste onde o próprio projeto já está adaptado para o mesmo, se você não usa o docker e prefere usar outros meios
basta ajusta o arquivo src/connection/ConnectionDB.java onde está as configurações de conexão.