package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fonte: https://www.nobre.pt/626/fibra-alimentar.htm
 * As fibras sao compostas por um conjunto de substancias de origem vegetal que o organismo humano nao consegue digerir ou absorver mas que desempenham variadas funcoes a nivel digestivo e intestinal, tornando-se fundamentais a saude.
 * Influenciam a velocidade da digestao e do esvaziamento gastrico, ajudam a controlar melhor o apetite e a saciedade, regulam a absorcao de alguns nutrientes, nomeadamente a glicose e o colesterol, ajudando a controlar os seus niveis no sangue.
 * As fibras sao fundamentais para o bom funcionamento intestinal e prevencao da obstipacao. Aumentam o volume das fezes e gracas ao seu efeito bifidogenico promovem o crescimento das bacterias protectoras do intestino.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Micronutrientes"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Fibra")
public interface Fibra extends Micronutrientes {
}
