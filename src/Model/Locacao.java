package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Locacao {
    private long id;
    private Date dataDevolucao;
    private Date dataRevolucao;
    private float valorLocacao;
    private List<Ocorrencia> listOcorrencias = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Date getDataRevolucao() {
        return dataRevolucao;
    }

    public void setDataRevolucao(Date dataRevolucao) {
        this.dataRevolucao = dataRevolucao;
    }

    public float getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(float valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public List<Ocorrencia> getListOcorrencias() {
        return listOcorrencias;
    }

    public void setListOcorrencias(List<Ocorrencia> listOcorrencias) {
        this.listOcorrencias = listOcorrencias;
    }
}
