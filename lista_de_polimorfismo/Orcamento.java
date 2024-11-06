class ItemOrcamento {
    private String historico; // histórico do item
    private float valor; // valor do item

    public ItemOrcamento(String historico, float valor) {
        this.historico = historico;
        this.valor = valor;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;

    }
}
class ItemOrcamentoComplexo extends ItemOrcamento {
    private ItemOrcamento[] subitens; 
    public ItemOrcamentoComplexo(String historico, float valor, ItemOrcamento[] subitens) {
        super(historico, valor);
        this.subitens = subitens;
    }

    @Override
    public float getValor() {
        float valorTotal = super.getValor();
        for (ItemOrcamento subitem : subitens) {
            if (subitem != null) {
                valorTotal += subitem.getValor();
            }
        }
        return valorTotal;
    }
    
    public ItemOrcamento encontraItem(String historico) {
        for (ItemOrcamento subitem : subitens) {
            if (subitem != null && subitem.getHistorico().equals(historico)) {
                return subitem;
            }
        }
        return null;
    }    
}

public class Orcamento {
    public static void main(String[] args) {
     
     ItemOrcamento item1 = new ItemOrcamento("Caneta", 2.5f);
     ItemOrcamento item2 = new ItemOrcamento("Lápis", 1.0f);

     ItemOrcamento[] subitens = new ItemOrcamento[10];
     subitens[0] = item1;
     subitens[1] = item2;
     ItemOrcamentoComplexo itemComplexo = new ItemOrcamentoComplexo("Material de Escritório", 0.0f, subitens);

     System.out.println("Valor total do item complexo: " + itemComplexo.getValor());

    
     ItemOrcamento itemEncontrado = itemComplexo.encontraItem("Caneta");
     if (itemEncontrado != null) {
         System.out.println("Item encontrado: " + itemEncontrado.getHistorico());
     } else {
         System.out.println("Item não encontrado.");
     }
         
    }
}
