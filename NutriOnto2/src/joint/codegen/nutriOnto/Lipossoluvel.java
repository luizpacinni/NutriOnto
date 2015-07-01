package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/624/vitaminas.htm
 * Lipossoluveis: Vitamina A, Vitamina D, Vitamina E, Vitamina K
 * 
 * Fonte: http://www.brasilescola.com/saude-na-escola/conteudo/vitaminas.htm
 * As vitaminas lipossoluveis sao soluveis em lipideos e sao representadas pelas vitaminas A, D, E e K, que podem ser encontradas associadas a gorduras no leite, queijo, gema de ovo, carne e figado. Essas vitaminas ficam armazenadas em nosso tecido adiposo, nao sendo necessario o seu consumo diario.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Vitamina"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Lipossoluvel")
public interface Lipossoluvel extends Vitamina {
}
