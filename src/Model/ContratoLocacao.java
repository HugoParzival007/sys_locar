package Model;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContratoLocacao {
    private long id;
    private Date dataContrato;
    private float valorCaucao;
    private Enum status;
    List<Locacao> listLocacao = new ArrayList<>();
    private float valorTotal;
    private Funcionario funcionario;
    private Cliente cliente;
}
