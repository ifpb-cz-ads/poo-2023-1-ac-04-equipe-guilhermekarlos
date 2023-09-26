## Questões teóricas

### Link para o diagrama de classes pedido nas questões 1 e 2 do Batista e Moraes:
https://lucid.app/lucidchart/61bef71e-27d6-44c7-9532-43ed69598fc2/edit?viewport_loc=-10%2C-10%2C1707%2C821%2C0_0&invitationId=inv_de3c23a2-77f5-4580-beb5-d43d4e2800ec

### Batista & Moraes (2013): exercícios 07 a 10 (páginas 79 a 80)

07 - O nome da classe não pode conter espaços ou caracteres especiais. É necessário remover os espaços em "Registro De Eleitor" e usar um nome de classe válido, como "RegistroDeEleitor" e a classe precisa de um `public` para funcionar corretamente. Além do mais, falta um construtor para inicializar os campos da classe.

08 - O método main deve ser declarado como public static void, não como public void static.
O objeto Data2 amanha; é declarado, mas não é inicializado usando o construtor. Tentar chamar o método inicializaData antes de inicializar o objeto causará um erro de referência nula (NullPointerException).
O método main deve estar dentro de uma classe que seja pública, caso contrário, o programa não pode ser executado diretamente.

09 - **Classe TesteImpressao:**
O método main deve ser declarado como `public static void main(String[] args)` para ser o ponto de entrada do programa Java. Além disso, a palavra-chave "void" indica que o método não retorna um valor.
Os parâmetros `String[] args` são obrigatórios no método main e devem ser incluídos.
O método main não deve retornar um valor, mas na linha 9, há um `return true`, o que não é válido. O método main deve ser do tipo void.

10 - **Classe TesteDatas:**
O método main deve ser declarado como public static void, não como `public void static`.
O objeto `Data2 amanha` é declarado, mas não é inicializado usando o construtor. Tentar chamar o método `inicializaData` antes de inicializar o objeto causará um erro de referência nula (NullPointerException).
O método main deve estar dentro de uma classe que seja pública, caso contrário, o programa não pode ser executado diretamente.

**Classe TesteObjetos:**
O objeto `Data a` é declarado, mas não é inicializado usando o construtor. Tentar atribuir `b = a` também causará um erro de referência nula (NullPointerException) porque `a` não foi inicializado.
