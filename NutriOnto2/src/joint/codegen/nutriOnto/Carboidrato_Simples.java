package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.nutricao.org/carboidratos/simples
 * Os carboidratos simples sao compostos de acucar, calorias vazias. Nao ha um dano real em ingerir alimentos com adicao de acucar (sacarose), pois e um carboidrato, nao afeta a glicemia de maneira diferente dos outros carboidratos. O carboidrato simples nao contem nenhum valor nutricional alem de calorias e onde tem acucar geralmente tem gordura, voce devera ter bom senso e controlar a quantidade de acucar ingerida. Alimentos com acucar podem ser substituidos por outros alimentos que contenham carboidratos compostos em seu plano alimentar.
 * Acucares: cana-de-acucar, acucar, melaco, mel, sorvetes, refrigerantes chocolates, bolos, doces, pudins, etc.
 * 
 * Fonte: http://mdemulher.abril.com.br/dieta/ana-maria/a-nova-dieta-do-carboidrato-sem-censura-mas-com-inteligencia
 * Por ter estrutura molecular pequena, ele e rapidamente absorvido pelo organismo. Isso aumenta a taxa de glicose no sangue (glicemia) e faz voce sentir fome mais rapido. Alem disso, o processo de refinamento manda embora vitaminas, minerais e fibras.
 * 
 * Exemplos: Arroz branco, pao branco, massas comuns, acucar e farinha.
 * 
 * Fonte: http://revistavivasaude.uol.com.br/nutricao/descubra-o-que-o-excesso-de-acucar-pode-causar/1882/#
 * Dentre os quadros clinicos desencadeados pelos excessos, estao as doencas cardiovasculares, a hipertensao arterial e a obesidade. Esse ultimo facilita o surgimento do diabetes tipo 2, patologia cronica subestimada pelos “formigas”. A doenca torna o organismo resistente a insulina, que e um hormonio produzido pelo pancreas para controlar a entrada de acucar nas celulas. Se a insulina produzida e insuficiente ou ineficaz, os acucares acabam retidos na corrente sanguinea, acarretando uma serie de complicacoes e ate a morte — caso a enfermidade nao seja devidamente tratada. Carlos Daniel Magnoni, nutrologo e cardiologista da Sociedade Brasileira de Cardiologia (SBC), fala que o sobrepeso “resulta em danos na coluna, aterosclerose (fechamento dos vasos que fornecem sangue e oxigenio ao coracao) e lesoes no figado”. Aumento do volume do abdome e flatulencia sao outros problemas comumente apresentados por viciados em acucar. “Tais alteracoes, podem, entre outros fatores, relacionar-se a mudancas na microbiota intestinal. O excesso de acucares simples (caso da sacarose, que e o tipo usado nos lares) leva a maior fermentacao, o que gera desconforto abdominal e gases. Alem disso, fungos e bacterias patogenicas utilizam-no para crescer e se proliferar”, diz Clarissa Poletti, nutricionista e diretora de Pesquisa e Desenvolvimento da Essential Nutrition (SC).
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carboidrato"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Carboidrato_Simples")
public interface Carboidrato_Simples extends Carboidrato {
}
