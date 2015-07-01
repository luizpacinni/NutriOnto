package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: http://www.abicab.org.br/balas-e-derivados/saude-e-nutricao/
 * O papel nutricional basico dos carboidratos, sejam eles acucares ou amidos, e fornecer energia. Essa energia e constantemente necessitada pelo corpo para manter a vida.
 * A sobrevivencia sem carboidrato e possivel (como dentre os esquimos primitivos), posto que a gordura e a proteina tambem fornecem energia. Contudo, uma dieta contendo apenas gordura ou proteina, ou ambas, como fonte de energia, seria insatisfatoria.
 * Aceita-se que o consumo de gordura deva ser limitado. Quanto a proteina, porem, sua funcao primaria e a formacao e manutencao do tecido. Consumi-la como fonte de energia seria desperdicador ou ate prejudicial em grande quantidade. Os carboidratos, na forma de glicose, sao necessarios para o cerebro como combustivel essencial para seu funcionamento.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Doces")
public interface Doces extends Alimento {
}
