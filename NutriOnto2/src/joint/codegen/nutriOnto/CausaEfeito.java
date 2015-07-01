package joint.codegen.nutriOnto;

import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Na classe CausaEfeito estao: 
 * - Nutrientes e patologias. Sendo que os nutrientes podem influenciar nas patologias tanto como pontos positivos, previnindo ou controlando determinada(s) patologia(s), ou como pontos negativos, causando patologias ou prejudicando individuos que tenham determinada(s) patologia(s).
 * 
 * 
 * Razao tecnica para sua criacao:
 * Fonte: http://lpis.csd.auth.gr/mtpx/sw/Things%20to%20be%20careful%20about-OWL.pdf
 * 
 * Super classe criada para ser usada no "Range" das propriedades PontoNegativo e PontoPositivo, a fim de realizar um agrupamento e evitar inferencias incorretas de classes nas instancias.
 * 
 * "...Many ranges When a property can have as a range many alternative classes, do not put them all in the range, because they are considered as intersection (AND) and not as union (OR). Instead, find a common superclass of all these classes and put it as a range. If these classes do not have a common superclass, then either create one (if it makes sense), or leave the range blank, or put owl:Thing as a range. If you want you can specialize the range for some of the classes that inherit that property, by using owl:allValuesFrom restriction. E.g. Students attend either postgraduate or undergraduate courses. But we should not put as the range..."
 */
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#CausaEfeito")
public interface CausaEfeito {
}
