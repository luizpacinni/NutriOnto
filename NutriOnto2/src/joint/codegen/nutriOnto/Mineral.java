package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.nutricao.org/sais-minerais
 * Exercem uma funcao eminentemente plastica no organismo, tomando parte na formacao dos tecidos que sustentam o organismo, do tecido osseo e cartilaginoso, e participam da composicao dos orgaos internos, globulos vermelhos, medula ossea, etc. A deficiencia de minerais pode causar doencas como raquitismo (calcio) e anemia (ferro). Destacamos o Calcio, Ferro, Potassio, Ferro, Sodio, Magnesio. Sao importantes na formacao dos tecidos, atuam no funcionamento das glandulas e musculos, participam na regulacao do ritmo cardiaco e respiratorio e na digestao e absorcao dos alimentos.
 * agua, proteinas, gorduras, hidratos de carbono e vitaminas compoem aproximadamente 96% do organismo, os 4% restantes sao constituidos por minerais, destes, 21 sao considerados essenciais a nutricao humana: calcio, fosforo, potassio, enxofre, sodio, cloro, magnesio, ferro, zinco, selenio, manganes, cobre, iodo, molibdenio, cobalto, cromo, silicio, vanadio, niquel, estanho e fluor. Alguns minerais presentes no corpo humano nao apresentam funcao conhecida (ouro, prata, aluminio, mercurio, bismuto, galio, chumbo, antimonio, boro, litio) e outros nao foram estabelecidos ainda como essenciais, participem de certas reacoes biologicas (arsenio, bario, cadmio, estroncio, bromo). Quando presentes em quantidades relativamente grandes no organismo, os minerais sao classificados de macronutrientes (calcio, fosforo, enxofre, magnesio).
 * Quando encontrados em taxas menores recebem o nome de microminerais, Que essa distincao nada tem a ver com a importancia dos minerais para o organismo, mais apenas com as quantidades nele encontradas. Os minerais essenciais tem funcao especifica e indispensavel, sua aparencia pode levar a quadros graves como por exemplo cretinismo (carencia de iodo), deficiencia de crescimento (zinco), alteracoes osseas e dentarios (fluor), anemia perniciosa (cobalto).
 * Algumas fontes de minerais:
 * Calcio: leite e derivados, couve, gergelim, amendoas e algas.
 * Fosforo: Frutas oleaginosas, levedura de cerveja, trigo germinado, peixe, leite e derivados, gema de ovo.
 * Ferro: Algas, verdura, melado, gema de ovo, beterraba, frutas secas.
 * Iodo: sal marinho, frutos do mar, algas, agrido, alho, vegetais que crescem a beira mar, brisa marinha.
 * Magnesio: Frutas secas, verduras, mel, frutas oleaginosas e polen.
 * Potassio: frutas, legumes e algas.
 * Zinco: frutos do mar, leite e derivados, trigo germinado, maxixe e levedura de cerveja.
 * Cobre: frutos do mar, algas, frutas secas, alho e verduras.
 * Cromo: cenoura, ervilha, cereais integrais e manteiga.
 * Enxofre: alho, cebola, agriao, couve, repolho, couve-flor.
 * Fluor: sementes de girassol, peixes, aves e carnes.
 * Cobalto: peixes, aves e carnes.
 * Selenio: ovos, carne, peixe, mariscos, cebola e alho.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Micronutrientes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Mineral")
public interface Mineral extends Micronutrientes {
}
