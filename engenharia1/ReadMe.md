# Texto 1
What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

# Resumo 1:
Demonstra de formas mais explicitas algumas das diferenças entre a progrmação e engenharia de software e mostra em como ambas as vezes são colocadas como iguais porêm são muito diferentes, pois pela engenharia de software são criadas coisas diretas e tangiveisja a programação cria coisas menos tangiveis e mais simuladas que tudo.


# Texto 2
Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth

# Resumo 2:
focus especifically in explaining how enterprises should create and envision their codes as those will impact the life cycle of the program itself.
The text also focus in explaining some proposals for the way software engineering shoul be taken and conects to the realisation of its diference from programming specifying the mantaining of the code as part of software engineers work.


# Trade offs:
1.Consumo presente versus consumo futuro
2.Produção versus preservação do meio-ambiente
3.Consumo versus lazer


# Resumo do slide 57:
O diagrama mostra duas abordagens para construir um produto:

"Not like this" (Não assim):
O desenvolvimento começa com partes individuais do produto final (como rodas) que, isoladamente, não são úteis até que o carro esteja completo.
Isso resulta em um processo onde o usuário só obtém valor no final, gerando insatisfação durante o caminho.

"Like this" (Assim):
O desenvolvimento começa com um produto funcional básico (skate), evoluindo para algo mais sofisticado (patinete, bicicleta, moto) até chegar ao carro.

Cada estágio já é utilizável, garantindo valor e satisfação contínuos ao usuário.
A citação de François Chollet (Google) reforça a ideia de que o melhor caminho para construir um sistema complexo é criar algo funcional desde o início, e não apenas desenvolver módulos isolados do produto final.