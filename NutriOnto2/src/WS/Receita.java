/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

/**
 *
 * @author luiz
 */
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Receita {

    private int id;
    private String name;
    private String tipo;

    Ingrediente ingrediente1;
    Ingrediente ingrediente2;
    Ingrediente ingrediente3;
    Ingrediente ingrediente4;
    Ingrediente ingrediente5;

    private String modoPreparo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ingrediente getIngrediente1() {
        return ingrediente1;
    }

    public void setIngrediente1(Ingrediente ingrediente1) {
        this.ingrediente1 = ingrediente1;
    }

    public Ingrediente getIngrediente2() {
        return ingrediente2;
    }

    public void setIngrediente2(Ingrediente ingrediente2) {
        this.ingrediente2 = ingrediente2;
    }

    public Ingrediente getIngrediente3() {
        return ingrediente3;
    }

    public void setIngrediente3(Ingrediente ingrediente3) {
        this.ingrediente3 = ingrediente3;
    }

    public Ingrediente getIngrediente4() {
        return ingrediente4;
    }

    public void setIngrediente4(Ingrediente ingrediente4) {
        this.ingrediente4 = ingrediente4;
    }

    public Ingrediente getIngrediente5() {
        return ingrediente5;
    }

    public void setIngrediente5(Ingrediente ingrediente5) {
        this.ingrediente5 = ingrediente5;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

}
