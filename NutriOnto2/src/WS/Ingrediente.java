/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import joint.codegen.nutriOnto.Alimento;
import nutrionto2.nutriOntoKAO;
import wwwc.nees.joint.facade.RepositoryFacade;

/**
 *
 * @author luiz
 */
class Ingrediente {

    private String nome;
    private String unidadeMedida;
    private String quantidade;

//    -1: negativo
//     0: nao definido
    private int diabetes;
    private int hipertensao;
    private int obesidade;

    public Ingrediente(String nome, String um, String qtde) {
        this.nome = nome;
        this.unidadeMedida = um;
        this.quantidade = qtde;
        this.diabetes = verificaIngredienteDiabetes(nome);
        this.hipertensao = verificaIngredienteHipertensao(nome);
        this.obesidade = verificaIngredienteObesidade(nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int isDiabetes() {
        return diabetes;
    }

    public void setDiabetes(int diabetes) {
        this.diabetes = diabetes;
    }

    public int isHipertensao() {
        return hipertensao;
    }

    public void setHipertensao(int hipertensao) {
        this.hipertensao = hipertensao;
    }

    public int isObesidade() {
        return obesidade;
    }

    public void setObesidade(int obesidade) {
        this.obesidade = obesidade;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public String getQuantidade() {
        return quantidade;
    }

//     1:  positivo
    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    private int verificaIngredienteDiabetes(String nome) {
        String ontology_path = "/home/luizpacinni_gmail_com/NutriOnto/NutriOnto2/nossaOntovinf2.owl";
        String ontology_uri = "http://www.semanticweb.org/debora/ontologies/2015/5/26/untitled-ontology-40#";
        RepositoryFacade facade = new RepositoryFacade();
        facade.addOntology(ontology_path, ontology_uri);
        nutriOntoKAO kao = new nutriOntoKAO(Alimento.class);

        if (kao.ehAlimentoNegativoDiabetes(nome)) {
            return -1;
        }
        if (kao.ehAlimentoPositivoDiabetes(nome)) {
            return 1;
        }
        return 0;
    }

    private int verificaIngredienteHipertensao(String nome) {
        String ontology_path = "/home/luizpacinni_gmail_com/NutriOnto/NutriOnto2/nossaOntovinf2.owl";
        String ontology_uri = "http://www.semanticweb.org/debora/ontologies/2015/5/26/untitled-ontology-40#";
        RepositoryFacade facade = new RepositoryFacade();
        facade.addOntology(ontology_path, ontology_uri);
        nutriOntoKAO kao = new nutriOntoKAO(Alimento.class);

        if (kao.ehAlimentoNegativoHipertensao(nome)) {
            return -1;
        }
        if (kao.ehAlimentoPositivoHipertensao(nome)) {
            return 1;
        }
        return 0;
    }

    private int verificaIngredienteObesidade(String nome) {
        String ontology_path = "/home/luizpacinni_gmail_com/NutriOnto/NutriOnto2/nossaOntovinf2.owl";
        String ontology_uri = "http://www.semanticweb.org/debora/ontologies/2015/5/26/untitled-ontology-40#";
        RepositoryFacade facade = new RepositoryFacade();
        facade.addOntology(ontology_path, ontology_uri);
        nutriOntoKAO kao = new nutriOntoKAO(Alimento.class);

        if (kao.ehAlimentoNegativoObesidade(nome)) {
            return -1;
        }
        if (kao.ehAlimentoPositivoObesidade(nome)) {
            return 1;
        }
        return 0;
    }

}
