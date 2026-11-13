# Padrão de Projeto Visitor

# Sobre o Projeto

Este projeto implementa o padrão de projeto comportamental **Visitor (Visitante)** em Java, simulando a exibição de informações de diferentes cargos de uma equipe de desenvolvimento.

O sistema permite representar diferentes profissionais, como Analista, Desenvolvedor e Designer, utilizando um visitante responsável por acessar e exibir suas informações, incluindo identificação, nome e nível do cargo.

# Elementos do Projeto

O projeto possui as seguintes classes e interfaces:

- **Cargo:** interface que define o método `aceitar()`, responsável por receber um visitante.
- **Analista:** representa um profissional da área de análise.
- **Desenvolvedor:** representa um profissional da área de desenvolvimento.
- **Designer:** representa um profissional da área de design.
- **CargoNivel:** armazena o nome do nível de cada cargo.
- **Visitor:** interface que define as operações de exibição para cada tipo de profissional.
- **CargoVisitor:** implementa as operações de exibição das informações dos profissionais.

# Aplicação do Padrão Visitor

O padrão Visitor permite adicionar novas operações a diferentes classes sem precisar modificar suas estruturas originais.

Neste projeto, a interface Cargo define o método `aceitar()`, implementado pelas classes Analista, Desenvolvedor e Designer. Esse método recebe um objeto Visitor e direciona a execução para a operação correspondente ao tipo de profissional.

A classe CargoVisitor implementa as operações responsáveis por exibir as informações de cada profissional, utilizando seus respectivos métodos de acesso.

Dessa forma, o sistema mantém a separação entre os dados dos objetos e as operações realizadas sobre eles, facilitando a manutenção e permitindo adicionar novas funcionalidades de maneira estruturada.