package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.portaleducacao.com.br/nutricao/artigos/29715/condimentos
 * Os condimentos ou temperos sao substancias usadas para ressaltar o sabor natural dos alimentos ou para imprimir-lhes um sabor novo. Historicamente foram usados para conservar alimentos Ornellas (2003).
 * Os condimentos traduzem, na maioria das vezes, habitos regionais. Grande parte dos ingredientes basicos dos condimentos se origina das regioes tropicais do Oriente, em menor proporcao da Europa e alguns das Americas: cravo, proveniente da Indonesia e Madagascar; canela, do Ceilao; louro, dos paises do Leste do Mediterraneo; anis, da Espanha, india e Mexico; mostarda, dos EUA e Inglaterra; semente de papoula, da Holanda, Alemanha etc.; salva dos EUA e Iuguslavia; tomilho e manjerona, da Franca; paprica, da Hungria, Chile e Argentina, e assim por diante. 
 * Claro esta que o uso dos varios condimentos ja esta muito generalizado, difundindo-se de um pais para o outro seu cultivo e uso, a medida que aumenta o intercambio universal.
 * Ha que ressaltar o acrescimo importante de nutrientes (vitaminas e minerais) no uso de ervas e outros condimentos.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Condimento")
public interface Condimento extends Alimento {
}
