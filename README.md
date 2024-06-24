
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

**Classe Funcionário Terceirizado**

*Estende da classe Funcionário*

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

Nessa fase do projeto, o foco foi criar um programa o mais simples possível, em conformidade com os requisitos iniciais estabelecidos. As classes foram implementadas conforme descrito anteriormente, garantindo a estruturação básica do sistema. A decisão de criar a classe Funcionário Terceirizado como uma extensão da classe Funcionário foi tomada visando reduzir a redundância de código e promover o reuso dos atributos e métodos compartilhados entre ambas as classes.

Para facilitar o acesso aos métodos de cada classe, optei por torná-los estáticos, possibilitando sua chamada sem a necessidade de instanciar novos objetos. 
