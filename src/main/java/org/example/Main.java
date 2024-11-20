//package org.example;
//
//class Tarefa{
//    String descricao;
//    boolean completa;
//    Tarefa proxima;
//
//    public Tarefa (String descricao){
//        this.descricao = descricao;
//        this.completa = false;
//        this.proxima = null;}
//
//    public void completar() {
//        this.completa = true;
//    }
//}
//
//class Gerenciador{
//    Tarefa head;
//
//    public void adicionar(String descricao){
//        Tarefa novaTarefa = new Tarefa(descricao);
//
//        if (head==null){
//            head = novaTarefa;
//        }else{
//            Tarefa atual = head;
//            while(atual.proxima!=null){
//                atual = atual.proxima;
//            }
//            atual.proxima = novaTarefa;
//        }
//    }
//
//    public void removertarefa(String descricao){
//        if (head == null){
//            System.out.println("A lista esta vazia");
//            return;
//        }
//
//        if(head.descricao.equals(descricao)){
//            head = head.proxima;
//            System.out.println("Tarefa removida com sucesso: "+ descricao);
//            return;
//        }
//
//        Tarefa atual = head;
//        while (atual.proxima != null && !atual.proxima.descricao.equals(descricao)){
//            atual = atual.proxima;
//        }
//        if (atual.proxima != null){
//            atual.proxima = atual.proxima.proxima;
//            System.out.println("Tarefa removida: "+ descricao);
//        }else{
//            System.out.println("Tarefa não localizada");
//        }
//    }
//
//    public void concluirtarefa(String descricao){
//        Tarefa atual = head;
//        while (atual != null){
//            if(atual.descricao.equals(descricao)){
//                atual.completar();
//                System.out.println("Tarefa completada: "+descricao);
//                return;
//            }
//            atual = atual.proxima;
//        }
//        System.out.println("Tarefa não localizada");
//    }
//
//    public void listartarefa(){
//        if (head == null){
//            System.out.println("Não existem tarefas para serem listadas");
//        }else{
//            Tarefa atual = head;
//            while (atual != null){
//                System.out.println(atual.descricao + "- Concluída: "+ atual.completa);
//                atual = atual.proxima;
//            }
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Gerenciador gerenciador = new Gerenciador();
//        gerenciador.adicionar("Estudar Logica");
//        gerenciador.adicionar("Realizar exercícios");
//        gerenciador.listartarefa();
//        gerenciador.concluirtarefa("Realizar exercícios");
//        gerenciador.listartarefa();
//    }
//}
//package org.example;
//
//class Urln{
//    String url;
//    Urln proxima;
//
//    public Urln (String url){
//        this.url = url;
//        this.proxima = null;}
//
//}
//
//class Historico{
//    Urln head;
//    int maxTam;
//    int atualTam;
//
//    public Historico(int maxTam){
//        this.maxTam = maxTam;
//        this.atualTam = 0;
//        this.head = null;
//    }
//
//    public void adicionar(String url){
//        Urln newUrln = new Urln(url);
//        if(atualTam == maxTam){
//            removerurl();
//        }
//        if (head==null){
//            head = newUrln;
//        }else{
//            Urln atual = head;
//            while(atual.proxima!=null){
//                atual = atual.proxima;
//            }
//            atual.proxima = newUrln;
//        }
//        atualTam++;
//        System.out.println("Visitou: "+ url);
//    }
//
//    private void removerurl(){
//        if (head != null){
//            head = head.proxima;
//            atualTam--;
//        }
//    }
//
//    public void listarhistorico(){
//        if (head == null){
//            System.out.println("Não existem urls para serem listadas");
//        }else{
//            Urln atual = head;
//            while (atual != null){
//                System.out.println(atual.url);
//                atual = atual.proxima;
//            }
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Historico historico = new Historico(4);
//        historico.adicionar("gremio.com");
//        historico.adicionar("gremiofbpa.com");
//        historico.listarhistorico();
//        historico.adicionar("netflix.com");
//        historico.adicionar("primevideo.com");
//        historico.listarhistorico();
//    }
//}
//package org.example;
//
//class Acao{
//    String descricao;
//    Acao proxima;
//
//    public Acao (String descricao){
//        this.descricao = descricao;
//        this.proxima = null;}
//
//}
//
//class Gerenciador{
//    Acao head;
//
//
//    public void adicionar(String descricao){
//        Acao novaacao = new Acao(descricao);
//        if (head==null){
//            head = novaacao;
//        }else{
//            Acao atual = head;
//            while(atual.proxima!=null){
//                atual = atual.proxima;
//            }
//            atual.proxima = novaacao;
//        }
//        System.out.println("Realizou: "+ descricao);
//    }
//
//    public void desfazer(){
//        if (head == null){
//            System.out.println("Nenhuma ação para ser desfeita");
//            return;
//        }else{
//            Acao atual = head;
//            while (atual.proxima != null && atual.proxima.proxima != null) {
//                atual = atual.proxima;
//            }
//            if (atual.proxima != null) {
//                System.out.println("Desfez a ação: " + atual.proxima.descricao);
//                atual.proxima = null;
//            }
//        }
//
//    }
//    public void listaracao(){
//        if (head == null){
//            System.out.println("Não existem ações para serem listadas");
//        }else{
//            Acao atual = head;
//            while (atual != null){
//                System.out.println(atual.descricao);
//                atual = atual.proxima;
//            }
//        }
//    }
//}
//
//
//public class Main {
//    public static void main(String[] args) {
//
//        Gerenciador gerenciador = new Gerenciador();
//        gerenciador.adicionar("Lavou a louça");
//        gerenciador.adicionar("fez almoço");
//        gerenciador.listaracao();
//        gerenciador.desfazer();
//        gerenciador.listaracao();
//    }
//}
//package org.example;
//
//class Acao{
//    String descricao;
//    Acao proxima;
//    Acao anterior;
//
//    public Acao (String descricao){
//        this.descricao = descricao;
//        this.proxima = null;
//        this.anterior = null;
//    }
//
//}
//
//class Gerenciador{
//    Acao head;
//    Acao atual;
//
//    public Gerenciador(){
//        this.head = null;
//        this.atual = null;
//    }
//
//    public void adicionar(String descricao){
//        Acao novaacao = new Acao(descricao);
//        if (head==null){
//            head = novaacao;
//            atual = head;
//        }else{
//            atual.proxima = novaacao;
//            novaacao.anterior = atual;
//            atual = novaacao;
//        }
//        System.out.println("Realizou: "+ descricao);
//    }
//
//    public void desfazer(){
//        if (atual == null){
//            System.out.println("Nenhuma ação para ser desfeita");
//            return;
//        }else{
//            if(atual != null){
//                System.out.println("Desfez a ação: " + atual.descricao);
//                atual = atual.anterior;
//            }
//        }
//
//    }
//    public void refazer(){
//        if (head == null){
//            System.out.println("Nenhuma ação para ser desfeita");
//            return;
//        }else{
//            if (atual.proxima != null && atual.proxima.proxima != null) {
//                System.out.println("Refez a ação: " + atual.proxima.descricao);
//                atual = atual.proxima;
//            }
//        }
//
//    }
//    public void listaracao(){
//        if (head == null){
//            System.out.println("Não existem ações para serem listadas");
//        }else{
//            Acao temp = head;
//            while (temp != null){
//                System.out.println(temp.descricao);
//                temp = temp.proxima;
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Gerenciador gerenciador = new Gerenciador();
//        gerenciador.adicionar("Lavou a louça");
//        gerenciador.adicionar("fez almoço");
//        gerenciador.listaracao();
//        gerenciador.desfazer();
//        gerenciador.refazer();
//        gerenciador.listaracao();
//    }
//}
//package org.example;
//
//class Cartas{
//    String descricao;
//    Cartas proxima;
//    Cartas anterior;
//
//    public Cartas (String descricao){
//        this.descricao = descricao;
//        this.proxima = null;
//        this.anterior = null;
//    }
//
//}
//
//class MaodeCartas{
//    Cartas head;
//    Cartas ultima;
//
//    public MaodeCartas(){
//        this.head = null;
//        this.ultima = null;
//    }
//
//    public void adicionar(String descricao){
//        Cartas novacarta = new Cartas(descricao);
//        if (head==null){
//            head = novacarta;
//            ultima = head;
//        }else{
//            ultima.proxima = novacarta;
//            novacarta.anterior = ultima;
//            ultima = novacarta;
//        }
//        System.out.println("carta: "+ descricao + " adicionada");
//    }
//
//    public void remover(String descricao){
//        Cartas atual = head;
//        while (atual != null && !atual.descricao.equals(descricao)){
//            atual = atual.proxima;
//        }
//        if(atual != null) {
//            if (atual.anterior != null) {
//                atual.anterior.proxima = atual.proxima;
//            } else {
//                head = atual.proxima;
//            }
//            if (atual.proxima != null) {
//                atual.proxima.anterior = atual.anterior;
//            } else {
//                ultima = atual.proxima;
//            }
//        }else{
//            System.out.println("Carta não existe");
//        }
//    }
//
//    public void listarcarta(){
//        Cartas atual = head;
//        if (atual == null){
//            System.out.println("Não existem ações para serem listadas");
//        }else{
//            while (atual != null){
//                System.out.println("Carta "+atual.descricao);
//                atual = atual.proxima;
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        MaodeCartas MaodeCartas = new MaodeCartas();
//        MaodeCartas.adicionar("Dama de Copas");
//        MaodeCartas.adicionar("7 de ouros");
//        MaodeCartas.listarcarta();
//        MaodeCartas.remover("Dama de Copas");
//        MaodeCartas.listarcarta();
//    }
//}
//package org.example;
//
//class Cliente{
//    String nome;
//    Cliente proximo;
//
//
//    public Cliente (String nome){
//        this.nome = nome;
//        this.proximo = null;
//    }
//
//}
//
//class Filadobanco{
//    Cliente primeiro;
//    Cliente ultimo;
//
//    public Filadobanco(){
//        this.primeiro = null;
//        this.ultimo = null;
//    }
//
//    public void adicionarcliente(String nome){
//        Cliente novocliente = new Cliente(nome);
//        if (primeiro==null){
//            primeiro = novocliente;
//            ultimo = novocliente;
//        }else{
//            ultimo.proximo = novocliente;
//            ultimo = novocliente;
//
//        }
//        System.out.println("Cliente: "+ nome + " adicionado");
//    }
//
//    public void atender(){
//        if(primeiro == null){
//            System.out.println("Não existe cliente na fila");
//        }else{
//            System.out.println("Cliente " + primeiro.nome + " servido");
//            primeiro = primeiro.proximo;
//            if(primeiro == null){
//                ultimo = null;
//            }
//        }
//    }
//
//    public void listarcliente(){
//        Cliente atual = primeiro;
//        if (atual == null){
//            System.out.println("Não existem ações para serem listadas");
//        }else{
//            while (atual != null){
//                System.out.println("Cliente "+atual.nome);
//                atual = atual.proximo;
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Filadobanco filadobanco = new Filadobanco();
//        filadobanco.adicionarcliente("Fábio");
//        filadobanco.adicionarcliente("Felipe");
//        filadobanco.atender();
//        filadobanco.listarcliente();
//        filadobanco.adicionarcliente("Bento");
//        filadobanco.listarcliente();
//    }
//}
//package org.example;
//
//class Impressoes{
//    String impressao;
//    Impressoes proximo;
//
//
//    public Impressoes (String impressao){
//        this.impressao = impressao;
//        this.proximo = null;
//    }
//
//}
//
//class Filaimpressao{
//    Impressoes primeira;
//    Impressoes ultima;
//
//    public Filaimpressao(){
//        this.primeira = null;
//        this.ultima = null;
//    }
//
//    public void adicionarimpressao(String impressao){
//        Impressoes novaImpressao = new Impressoes(impressao);
//        if (primeira==null){
//            primeira = novaImpressao;
//            ultima = novaImpressao;
//        }else{
//            ultima.proximo = novaImpressao;
//            ultima = novaImpressao;
//
//        }
//        System.out.println("Documento: "+ impressao + " adicionado na fila de impressao");
//    }
//
//    public void imprimir(){
//        if(primeira == null){
//            System.out.println("Não existe impressões na fila");
//        }else{
//            System.out.println("Documento " + primeira.impressao + " impressa");
//            primeira = primeira.proximo;
//            if(primeira == null){
//                ultima = null;
//            }
//        }
//    }
//
//    public void listarfila(){
//        Impressoes atual = primeira;
//        if (atual == null){
//            System.out.println("Não existem impressões na fila para serem listadas");
//        }else{
//            while (atual != null){
//                System.out.println("Documento na fila "+atual.impressao);
//                atual = atual.proximo;
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Filaimpressao filaimpressao = new Filaimpressao();
//        filaimpressao.adicionarimpressao("Relatório de faturamento");
//        filaimpressao.adicionarimpressao("Relatório de entrega");
//        filaimpressao.imprimir();
//        filaimpressao.listarfila();
//    }
//}
//package org.example;
//
//class Processo{
//    String descricao;
//    Processo proximo;
//
//
//    public Processo (String descricao){
//        this.descricao = descricao;
//        this.proximo = null;
//    }
//
//}
//
//class Filaprocessos{
//    Processo primeiro;
//    Processo ultimo;
//
//    public Filaprocessos(){
//        this.primeiro = null;
//        this.ultimo = null;
//    }
//
//    public void adicionarprocesso(String descricao){
//        Processo novoprocesso = new Processo(descricao);
//        if (primeiro==null){
//            primeiro = novoprocesso;
//            ultimo = novoprocesso;
//        }else{
//            ultimo.proximo = novoprocesso;
//            ultimo = novoprocesso;
//
//        }
//        System.out.println("Processo: "+ descricao + " adicionado na fila de processos");
//    }
//
//    public void concluir(){
//        if(primeiro == null){
//            System.out.println("Não existe processos na fila");
//        }else{
//            System.out.println("Processo " + primeiro.descricao + " executado");
//            primeiro = primeiro.proximo;
//            if(primeiro == null){
//                ultimo = null;
//            }
//        }
//    }
//
//    public void listarfila(){
//        Processo atual = primeiro;
//        if (atual == null){
//            System.out.println("Não existem processos na fila para serem executados");
//        }else{
//            while (atual != null){
//                System.out.println("Processo na fila "+atual.descricao);
//                atual = atual.proximo;
//            }
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Filaprocessos filaprocessos = new Filaprocessos();
//        filaprocessos.adicionarprocesso("Limpeza de pasta");
//        filaprocessos.adicionarprocesso("Escaneamento de segurança");
//        filaprocessos.listarfila();
//        filaprocessos.concluir();
//        filaprocessos.listarfila();
//    }
//}
//
//
//
