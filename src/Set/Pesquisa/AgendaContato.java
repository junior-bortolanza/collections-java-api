package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
   }

   public void exibirContato(){
       System.out.println(contatoSet);
   }

   public Set<Contato> pesquisaPorNome(String nome) {
       Set<Contato> contatoPorNome = new HashSet<>();
       for (Contato c : contatoSet) {
           if (c.getNome().startsWith(nome)) {
               contatoPorNome.add(c);
           }
       }
       return contatoPorNome;
   }

   public Contato atualizarNumeroContato(String nome, int novoNUmero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNUmero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
   }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();

        agendaContato.exibirContato();

        agendaContato.adicionarContato("Camila", 123456);
        agendaContato.adicionarContato("Camila", 0);
        agendaContato.adicionarContato("Camila Vieira", 1111111);
        agendaContato.adicionarContato("Camila DIO", 654554);
        agendaContato.adicionarContato("Junior Bortolanza", 1111111);

        agendaContato.exibirContato();

        System.out.println(agendaContato.pesquisaPorNome("Junior"));

        System.out.println("Contato atualizado: " + agendaContato.atualizarNumeroContato("Junior Bortolanza", 555555));

        agendaContato.exibirContato();
    }

}
