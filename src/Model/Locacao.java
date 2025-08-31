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
}
