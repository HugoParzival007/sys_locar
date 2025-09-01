package Model;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private long id;
    private String nome;
    private float valorLocação;

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

    public float getValorLocação() {
        return valorLocação;
    }

    public void setValorLocação(float valorLocação) {
        this.valorLocação = valorLocação;
    }

    public List<Modelo> getListaModelos() {
        return listaModelos;
    }

    public void setListaModelos(List<Modelo> listaModelos) {
        this.listaModelos = listaModelos;
    }

    private List<Modelo> listaModelos = new ArrayList<>();
}
