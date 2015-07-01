package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.alimentacaosaudavel.org/lacticinios.html
 * Os lacticinios sao geralmente definidos como produtos derivados do leite de vaca, como o leite simples, iogurte e queijo. Estes alimentos sao boas fontes de proteinas, calcio, vitaminas e de outros nutrientes essenciais. Durante as ultimas decadas, tem sido feita muita pesquisa em relacao aos lacticinios que ve para alem da sua contribuicao de nutrientes essenciais para explorar as suas potenciais funcoes na nutricao, promocao de saude e prevencao de doencas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Derivados_do_Leite")
public interface Derivados_do_Leite extends Alimento {
}
