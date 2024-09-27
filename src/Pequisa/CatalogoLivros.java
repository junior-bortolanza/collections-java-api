package Pequisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributos
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }
    public void adicionarLivro(String titulo, String autor, int anoDePublicacao){
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao()<= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisaPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Head First 1: Python", "O'relly 1", 2015);
        catalogoLivros.adicionarLivro("Head First 2: Python", "O'relly 2", 2016);
        catalogoLivros.adicionarLivro("Head First 3: Python", "O'relly 3", 2021);
        catalogoLivros.adicionarLivro("Head First 4: Python", "O'relly 4", 2013);
        catalogoLivros.adicionarLivro("Head First 5: Python", "O'relly 5", 2015);
        catalogoLivros.adicionarLivro("Head First 6: Python", "O'relly 6", 2015);

        System.out.println(catalogoLivros.pesquisarPorAutor("O'relly 2"));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Head First 1: Python"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2020, 2022));

    }

}

