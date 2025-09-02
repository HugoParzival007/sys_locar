package Model;

import java.util.ArrayList;
import java.util.List;

public class Marca {
    private long id;
    private String nome;
    private List<Modelo> listModelo = new ArrayList<>();

    public Marca(long id, String nome, List<Modelo> listModelo) {
        this.id = id;
        this.nome = nome;
        this.listModelo = listModelo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Modelo> getListModelo() {
        return listModelo;
    }

    public void setListModelo(List<Modelo> listModelo) {
        this.listModelo = listModelo;
    }


}
