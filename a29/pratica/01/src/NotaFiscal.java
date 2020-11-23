import java.util.List;

public class NotaFiscal {
    private List<itemNotaFiscal> itens;

    public NotaFiscal(List<itemNotaFiscal> itens) {
        this.itens = itens;
    }

    public float getTotal() {
        float acumulador = 0.0f;
        for (itemNotaFiscal item : itens) {
            acumulador += item.getTotal();
        }
        return acumulador;
    }

}