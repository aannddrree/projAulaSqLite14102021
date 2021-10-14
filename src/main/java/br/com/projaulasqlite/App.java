package br.com.projaulasqlite;

import br.com.projaulasqlite.Model.Agenda;
import br.com.projaulasqlite.Repository.AgendaDB;

public class App {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        //a.setNome("André");
        //a.setTelefone("16 9 88887777");

        for (int i = 1 ; i <= 1000; i++){
            AgendaDB db = new AgendaDB();
            a.setNome("Teste " + i);
            a.setTelefone("Telefone " + i);
            db.inserir(a);
        }
    }
}
