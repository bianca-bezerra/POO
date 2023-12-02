package tributo;

/* 11. 
c) Crie uma classe de testes que instancie várias classes ContaCorrente e
SeguroDeVida, adicione-as na classe AuditoriaInterna e exiba o resultado
do método calculaTributos. Perceba que a classe de auditoria não se
preocupa que tipo de classe está sendo passada. */

public class Teste {
    public static void main(String[] args) {
        
        AuditoriaInterna auditoria = new AuditoriaInterna();
        
        ContaCorrente contac1 = new ContaCorrente("João", 1000);
        ContaCorrente contac2 = new ContaCorrente("Maria", 2000);
        
        SeguroDeVida contas1 = new SeguroDeVida();
        SeguroDeVida contas2 = new SeguroDeVida();

        auditoria.adicionar(contac1);
        auditoria.adicionar(contac2);
        auditoria.adicionar(contas1);
        auditoria.adicionar(contas2);

        System.out.println(auditoria.calculaTributos());
    }
}
