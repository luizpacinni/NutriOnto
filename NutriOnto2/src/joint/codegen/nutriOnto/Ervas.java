package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.sonutricao.com.br/conteudo/artigos/ervas/
 * Temperos, condimentos e especiarias sao aqueles produtos constituidos de uma ou diversas substancias saborosas, de origem natural, com ou sem valor nutritivo, empregados nos alimentos para ressaltar ou modificar o seu sabor, podendo ainda ser utilizados como produtos de beleza e medicamentos. A maior parte dos condimentos e especiarias possui qualidades culinarias e medicinais e sao ingredientes essenciais numa alimentacao saudavel e equilibrada, pois alem de realcarem o sabor dos alimentos, ajudam na digestao, melhoram a estetica do alimento e possuem qualidades terapeuticas.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Verduras"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Ervas")
public interface Ervas extends Verduras {
}
