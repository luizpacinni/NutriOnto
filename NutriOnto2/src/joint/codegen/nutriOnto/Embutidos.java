package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.marinaresende.com.br/posts/dicas-de-nutricao/o-que-voce-sabe-sobre-os-embutidos
 * Os embutidos (salsicha, mortadela, presunto, peito de peru) sao elaborados com carne ou orgaos comestiveis, cujo envoltorio e constituido por tripa, bexiga ou membrana animal. Ja a composicao, por carne mecanicamente separada, miudos comestiveis como estomago, coracao, lingua, rins e figado, pele, tendoes e gordura. Como conservantes sao utilizados sodio em quantidade elevada e nitrato, que no nosso organismo e convertido em nitrosamina, substancia toxica com propriedades cancerigenas que predispoem o desenvolvimento de cancer, principalmente de esofago e estomago.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Embutidos")
public interface Embutidos extends Alimento {
}
