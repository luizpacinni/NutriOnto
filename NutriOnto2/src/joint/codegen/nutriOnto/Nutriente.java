package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/619/descubra-tudo-o-que-os-nutrientes-podem-fazer-por--si.htm
 * Os nutrientes sao substancias presentes nos alimentos, e que o organisms nao consegue produzir, sao fundamentais para o bom funcionamento do organismo. 
 * Existem 7 grupos de nutrientes com funcoes bem distintas no nosso organismo e cujas necessidades sao variaveis, dependem por um lado, do tipo de nutriente mas tambem das necessidades de cada individuo.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Causa", "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#CausaEfeito"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Nutriente")
public interface Nutriente extends Causa, CausaEfeito {
}
