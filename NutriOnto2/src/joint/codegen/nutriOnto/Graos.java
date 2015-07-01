package joint.codegen.nutriOnto;

import joint.codegen.rdfs.subClassOf;
import wwwc.nees.joint.compiler.annotations.Iri;

/** 
 * Fontes: http://www.sonutricao.com.br/conteudo/guia/cereais.php
 * http://www.alimentacaosaudavel.org/Leguminosas.html
 * Cereais e leguminosas.
 * Cereais sao as sementes ou graos comestiveis das gramineas. Fazem parte do habito alimentar de diversos povos, devido a sua facilidade de manutencao e conservacao; por seu baixo custo e pelo alto valor nutritivo.
 * Nos graos de cereais podemos encontrar nutrientes como: carboidratos, proteinas, gorduras, sais minerais, vitaminas, enzimas e outras substancias. Os integrais, alem desses nutrientes, sao ricos em fibras. Os carboidratos aparecem em altos indices no grao (78 a 83%), variando com o tipo de cereal e plantio. O amido representa quase toda a totalidade dos carboidratos dos cereais. e um polissacarideo da glicose encontrado na natureza na forma de amilose e amilopectina.
 * As leguminosas sao consumidas pelos humanos desde a mais antiga pratica da agricultura e tem-lhes sido atribuidos papeis medicinais e culturais assim como nutritivos. Sao um importante componente da alimentacao em paises em desenvolvimento em africa, America Latina e asia onde sao especialmente valiosos como fonte de dieta de proteina.
 * As leguminosas sao um tipo de plantas cujas sementes crescem em vagens. Podem ser comestiveis como os feijoes, soja, alfalfa, lentilhas, pinhoes e ervilhas, ou nao, como o trevo.
 * As leguminosas sao uma valiosa parte duma alimentacao saudavel e boa nutricao, porque tem pouca gordura, nao contem colesterol, e tem uma significativa quantidade de fibra.
 * O conteudo nutricional das leguminosas maduras e diferente do conteudo nutricional das leguminosas secas, ja que estas sao as “sementes” das plantas e portanto sao nutricionalmente densos. As leguminosas sao fortes em fibra, gordura pouco saturada de complexos hidratos de carbono e proteina de boa qualidade. O consumo regular parece ter um efeito protector contra doencas cardiovasculares e alguns cancros. Para ganhar o beneficio da proteina da leguminosa esta deve ser cozinhada e comida com um cereal (de preferencia cereal integral em grao).
 * As leguminosas fornecem a melhor fonte de proteina concentrada do reino vegetal.
 */
@subClassOf({"http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Alimento"})
@Iri("http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#Graos")
public interface Graos extends Alimento {
}
