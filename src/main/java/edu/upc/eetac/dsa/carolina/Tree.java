package edu.upc.eetac.dsa.carolina;

import com.sun.org.apache.xpath.internal.operations.*;

import java.lang.String;

/**
 * Created by Carolina on 27/09/2015.
 */
public class Tree {
    private String tipo;
    private int altura;

public Tree() {
    this(0,null);
    }
public Tree(int altura){
    this(altura,null);
}
    public Tree (String tipo){
        this(0,tipo);
    }
    public Tree (int altura, String tipo){
        this.altura= altura;
        this.tipo=tipo;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");
        if (tipo == null)
            sb.append("árbol");
        else
            sb.append(tipo);
        if (altura > 0)
            sb.append(" de ").append(altura).append(" metros");
        return sb.toString();
    }
}
