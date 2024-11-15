public class Data {
    private byte dia, mes;
    private short ano;
    /*A classe construtor estava privada, 
    o que impedia de ser acessada na main ou em possíveis classes herdeiras */
    public Data(byte dd, byte mm, short aa) {
        this.dia = dd;
        this.mes = mm;
        this.ano = aa;
    }
}