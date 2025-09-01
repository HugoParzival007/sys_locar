package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Modelo {
    private long id;
    private String nome;
    private Date ano;
    private int qtModelo;
    private List<Veiculo> listVeiculo=new ArrayList<>();

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

    public Date getAno() {
        return ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getQtModelo() {
        return qtModelo;
    }

    public void setQtModelo(int qtModelo) {
        this.qtModelo = qtModelo;
    }

    public List<Veiculo> getListVeiculo() {
        return listVeiculo;
    }

    public void setListVeiculo(List<Veiculo> listVeiculo) {
        this.listVeiculo = listVeiculo;
    }
}
