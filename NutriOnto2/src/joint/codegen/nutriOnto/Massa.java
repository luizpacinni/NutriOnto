package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fontes: http://www.portaleducacao.com.br/nutricao/artigos/51413/massas
 * http://www.drashirleydecampos.com.br/noticias/21811
 * Por serem ricas em carboidratos, fornecendo energia as massas sao alimentos importantes para a nossa dieta. Porem, se consumidas em excesso sao transformadas em gordura e sao armazenadas pelo corpo, se transformando nos famosos “pneuzinhos”. Apesar de serem consideradas vilas por seu alto valor calorico, podem ser incorporadas em uma dieta saudavel, desde que consumidas com moderacao e incluindo principalmente hortalicas e reduzindo a quantidade de ingredientes ricos em calorias e gorduras como creme de leite, manteiga, queijos amarelos, etc.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Massa")
public interface Massa extends Alimento {
}
