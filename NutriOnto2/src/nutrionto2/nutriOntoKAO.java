/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nutrionto2;

import wwwc.nees.joint.module.kao.AbstractKAO;
import java.util.*;
import joint.codegen.nutriOnto.*;

/**
 *
 * @author Debora
 */
public class nutriOntoKAO extends AbstractKAO {

    public <T> nutriOntoKAO(Class<T> classe) {
        super(classe);
    }

    public List<Doces> getTodosOsDoces() {
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?doce WHERE {?doce a nutriOnto:Doces}";
        return this.executeSPARQLqueryResultList(consulta);
    }

    public List<Massa> getTodasAsMassas() {
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?massa WHERE {?massa a nutriOnto:Massa}";
        return this.executeSPARQLqueryResultList(consulta);
    }

    public List<AlimentosNegativosDiabetes> getTodosAlimentosNegativosDiabetes() {
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosNegativosDiabetes}";
        return this.executeSPARQLqueryResultList(consulta);
    }

    public boolean ehAlimentoNegativoDiabetes(String alimento) {
        alimento = "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#" + alimento;
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosNegativosDiabetes FILTER regex(?alimento, '" + alimento + "')}";
        return !executeSPARQLqueryResultList(consulta).isEmpty();
    }

    public boolean ehAlimentoPositivoDiabetes(String alimento) {
        alimento = "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#" + alimento;
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosPositivosDiabetes FILTER regex(?alimento, '" + alimento + "')}";
        return !executeSPARQLqueryResultList(consulta).isEmpty();
    }

    public boolean ehAlimentoPositivoHipertensao(String alimento) {
        alimento = "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#" + alimento;
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosPositivosHipertensao FILTER regex(?alimento, '" + alimento + "')}";
        return !executeSPARQLqueryResultList(consulta).isEmpty();
    }

    public boolean ehAlimentoNegativoHipertensao(String alimento) {
        alimento = "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#" + alimento;
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosNegativosHipertensao FILTER regex(?alimento, '" + alimento + "')}";
        return !executeSPARQLqueryResultList(consulta).isEmpty();
    }

    public boolean ehAlimentoPositivoObesidade(String alimento) {
        alimento = "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#" + alimento;
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosPositivosObesidade FILTER regex(?alimento, '" + alimento + "')}";
        return !executeSPARQLqueryResultList(consulta).isEmpty();
    }

    public boolean ehAlimentoNegativoObesidade(String alimento) {
        alimento = "http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#" + alimento;
        String consulta = "PREFIX nutriOnto:<http://www.semanticweb.org/debora/ontologies/2015/4/nutriOnto#> SELECT ?alimento WHERE {?alimento a nutriOnto:AlimentosNegativosObesidade FILTER regex(?alimento, '" + alimento + "')}";
        return !executeSPARQLqueryResultList(consulta).isEmpty();
    }
}
