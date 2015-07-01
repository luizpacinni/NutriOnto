package joint.codegen.nutriOnto;

import java.util.Set;
import javax.xml.datatype.XMLGregorianCalendar;
import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.sonutricao.com.br/conteudo/guia/hortalicas.php
 * Verduras e legumes sao plantas ou parte de plantas que servem para o consumo humano, como folhas, flores, frutos, caules, sementes, tuberculos e raizes.
 * Utiliza-se a dominacao verdura quando as partes comestiveis do vegetal sao folhas, flores, hastes, como espinafre, brocolis, alface e a denominacao legume quando as partes comestiveis sao os frutos, as sementes ou as partes que se desenvolvem na terra, como abobrinha, tomate, mandioca.
 * A maioria das verduras e dos legumes sao fontes de vitaminas, minerais e fibras. Destacando-se a vitamina C, vitaminas do complexo B, vitamina A (betacaroteno), presente nos vegetais amarelo e alaranjados. Nos minerais, destacam-se o ferro, calcio, potassio e magnesio. Fibras soluveis e insoluveis tambem sao encontradas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Verduras")
public interface Verduras extends Alimento {
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	Set<XMLGregorianCalendar> getNutriOntoSazonalidade();
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	void setNutriOntoSazonalidade(Set<? extends XMLGregorianCalendar> nutriOntoSazonalidade);

}
