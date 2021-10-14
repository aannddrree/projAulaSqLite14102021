package br.com.projaulasqlite;

public class App {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.setId(1);
        a.setNome("André");
        a.setTelefone("16 9 88887777");
        AgendaDB db = new AgendaDB();
        db.inserir(a);
    }
}
