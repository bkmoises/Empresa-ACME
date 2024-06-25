

# Clean Code - Projeto Infnet

## Empresa ACME

Este projeto foi desenvolvido para a disciplina de Clean Code do curso de Engenharia de Software, tem como objetivo demonstrar a aplicação dos princípios e práticas do Clean Code na construção de um software. O projeto foi estruturado em três partes distintas, cada uma representada por um branch separado no repositório, evidenciando o progresso das atividades realizadas.

### Primeira Entrega
##### Desenvolvimento
Nesta etapa, elaborei um caso simples conforme as instruções previamente disponibilizadas. O foco foi construir o sistema sem se preocupar em escrever código limpo ou em seguir qualquer padrão de projeto.

Na primeira etapa do projeto, me concentrei em criar um caso de uso básico de acordo com as diretrizes fornecidas previamente. Meu objetivo principal foi estabelecer a estrutura do sistema, sem dedicar atenção significativa à qualidade do código ou à adesão a padrões de design específicos.

Nesse estágio, as seguintes classes foram criadas:
	 
**Classe Funcionário**

**Atributos:**
- `Nome` (String)
- `Telefones` (Lista)
- `Endereço` (String)
- `Salário` (Double)
- `Setor` (String)
- `Cargo` (String)

**Métodos:**
- `ajustarSalario()`: Método para ajustar o salário do funcionário.
- `listarFuncionarios()`: Método para listar os funcionários.
- `adicionarFuncionario()`: Método para adicionar um novo funcionário.

**Classe FuncionárioTerceirizado**

*Estende da classe `Funcionário`*

**Atributos:**
- `Nome` (String) - Herdado da classe Funcionário
- `Telefones` (Lista) - Herdado da classe Funcionário
- `Endereço` (String) - Herdado da classe Funcionário
- `Salário` (Double) - Herdado da classe Funcionário
- `Setor` (String) - Herdado da classe Funcionário
- `Cargo` (String) - Herdado da classe Funcionário
- `EmpresaContratada`
- `TempoPermanencia`

**Métodos:**
- `ajustarSalario()` - Herdado da classe Funcionário
- `listarFuncionarios()` - Herdado da classe Funcionário
- `adicionarFuncionario()` - Herdado da classe Funcionário
	 
#### Implementação

Nessa fase do projeto, o foco foi criar um programa o mais simples possível, em conformidade com os requisitos iniciais estabelecidos. As classes foram implementadas conforme descrito anteriormente, garantindo a estruturação básica do sistema. A decisão de criar a classe `FuncionárioTerceirizado` como uma extensão da classe `Funcionário` foi tomada visando reduzir a redundância de código e promover o reuso dos atributos e métodos compartilhados entre ambas as classes.

Para facilitar o acesso aos métodos de cada classe, optei por torná-los estáticos, possibilitando sua chamada sem a necessidade de instanciar novos objetos. 

### Segunda Entrega

#### Implementação

Durante esta etapa, procedi com o refinamento do código visando torná-lo mais legível e facilitar sua manutenção, seguindo os princípios do Clean Code. 

As mudanças realizadas incluem:

-   Remoção das variáveis cargos e setores da classe `Funcionário`, substituindo-as por uma implementação de Enum com os mesmos valores. Essa modificação tornou a utilização e a manutenção mais intuitivas e organizadas.

Com a eliminação dessas variáveis, não havia mais necessidade de acessar a lista de cargos e setores. Assim, o construtor da classe `Funcionário` foi atualizado para não mais solicitar o código do setor e do cargo durante o instanciamento do objeto.

-   Os métodos `listarFuncionarios`, `reajustarSalario` e `adicionarFuncionario` foram removidos da classe `Funcionário`. Embora interajam com essa classe, esses métodos não fazem sentido estarem diretamente relacionados a ela no contexto de negócio.
    
-   Os métodos `adicionarFuncionário` e `listarFuncionarios` foram implementados em uma nova classe denominada `FuncionarioService`. Essa classe ficará responsável por lidar com funções que interagem diretamente com a classe `Funcionário`.
    
-   O método `reajustarSalario` foi movido para uma nova classe chamada `FuncionarioACME`. Esta classe é responsável por manter os funcionários que de fato são da empresa ACME e são os únicos que podem sofrer reajuste salarial. Além disso, essa nova classe estende a classe Funcionario e implementa apenas um método.
    
	 
**FuncionarioService**

**Atributos:**
- `funcionarios` (Lista\<Funcionario\>)


**Métodos:**
- `adicionarFuncionario()`: Método responsável por adicionar um novo funcionário à lista de funcionários.
- `listarFuncionarios()`: Método responsável por listar os nomes dos funcionários atualmente na lista.

	 
**FuncionarioACME**

**Métodos:**
- `reajustarSalario()`: Método para reajustar o salário do funcionário com base em um aumento percentual fornecido como parâmetro.

[Terceira Entrega](https://github.com/bkmoises/Empresa-ACME/tree/terceira-entrega?tab=readme-ov-file#terceira-entrega)
