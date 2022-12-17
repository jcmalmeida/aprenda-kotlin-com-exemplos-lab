# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```

**Modificações e melhorias realizadas:**

- Classe “Usuário” agora é data class e pode ter nome, email e pontuação em seu construtor (todos modificáveis). “Usuário” pode ganhar uma pontuação ao concluir uma formação;
- “Conteúdo Educacional” agora tem nível em seu construtor e a duração não tem valor padrão;
- “Formação” agora tem pontuação em seu construtor. O atributo conteúdos foi retirado do construtor e foi alterado para o tipo val e mutable para permitir a inserção de novos elementos. A data class “Formação” também recebeu uma sobrescrita do método toString(), para mostrar os elementos presentes na lista conteúdos e inscritos de maneira mais “limpa”;
- No programa principal, foram cadastrados duas formações (inicial e Kotlin), às quais foram adicionados 3 conteúdos diferentes. Foram criados 3 usuários (João, Maria e Filomena), que foram matriculados nas formações. Nem todos os usuários concluíram todas as formações e, por consequência, não receberam a mesma pontuação.