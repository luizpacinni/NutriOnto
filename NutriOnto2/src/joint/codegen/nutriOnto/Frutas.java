package joint.codegen.nutriOnto;

import java.util.Set;
import javax.xml.datatype.XMLGregorianCalendar;
import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.alimentacaosaudavel.org/Fruta.html
 * A palavra fruta tem muitos significados diferentes, dependendo do contexto em que se utiliza. Em botanica, um fruto e o ovario e sementes amadurecidas de uma planta em flor, e em muitas especies, o fruto incorpora o ovario e os tecidos circundantes. Os frutos sao assim, em botanica, os meios pelos quais as plantas florescem e disseminam as sementes.
 * Na cozinha, quando os alimentos sao denominados frutos, o termo e mais utilizado para designar os frutos de plantas comestiveis, doces e carnudos, e que incluem, como exemplo, ameixas, macas e laranjas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Frutas")
public interface Frutas extends Alimento {
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	Set<XMLGregorianCalendar> getNutriOntoSazonalidade();
	@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Sazonalidade")
	void setNutriOntoSazonalidade(Set<? extends XMLGregorianCalendar> nutriOntoSazonalidade);

}
