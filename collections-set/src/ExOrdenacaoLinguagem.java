/*Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em seguida, crie um conjunto com 3 linguagens e faç um program que ordene esse conjunto 
 * 
 * Série 1 = Nome: Java, anoCriacao: 2000, ide: AndroidStudio
   Série 2 = Nome: Kotlin, anoCriacao: 2011, ide: AndroidStudio
   Série 3 = Nome: Python, anoCriacao: 2002, ide: Vscode
*/
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExOrdenacaoLinguagem {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 2000, "Vscode"));
            add(new LinguagemFavorita("Python", 2000, "PyCharm"));
            add(new LinguagemFavorita("Kotlin", 2011, "AndroidStudio"));
        }};


        System.out.println("--\tOrdem de inserção\t--");
        for (LinguagemFavorita linguagem : linguagens) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());
        
        System.out.println();

        System.out.println("--\tOrdem natural (nome)\t--");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for (LinguagemFavorita linguagem : linguagens2) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("--\tOrdem natural (ide)\t--");
        Set<LinguagemFavorita> linguagens3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        linguagens3.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens3) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("--\tOrdem natural (Ano/Nome)\t--");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoNome());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

        System.out.println("--\tOrdem natural (Nome/Ano/Ide)\t--");
        Set<LinguagemFavorita> linguagens5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoIde());
        linguagens5.addAll(linguagens);
        for (LinguagemFavorita linguagem : linguagens4) System.out.println(linguagem.getNome() + " - " + linguagem.getAnoDeCriacao() + " - " + linguagem.getIde());

    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
    String nome;
    int anoDeCriacao;
    String ide;


    public LinguagemFavorita(String nome, int anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }


    public String getNome() {
        return nome;
    }


    public int getAnoDeCriacao() {
        return anoDeCriacao;
    }


    public String getIde() {
        return ide;
    }


    @Override
    public String toString() {
        return "[nome=" + nome + ", anoDeCriacao=" + anoDeCriacao + ", ide=" + ide + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + anoDeCriacao;
        result = prime * result + ((ide == null) ? 0 : ide.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LinguagemFavorita other = (LinguagemFavorita) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (anoDeCriacao != other.anoDeCriacao)
            return false;
        if (ide == null) {
            if (other.ide != null)
                return false;
        } else if (!ide.equals(other.ide))
            return false;
        return true;
    }


    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.ide.compareToIgnoreCase(l2.ide);
    }

}

class ComparatorAnoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = Integer.compare(l1.anoDeCriacao, l1.anoDeCriacao);
        if(ano != 0) return ano;

        return l1.nome.compareToIgnoreCase(l2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.nome.compareToIgnoreCase(l2.nome);
        int anoDeCriacao = Integer.compare(l1.anoDeCriacao, l2.anoDeCriacao);
        if (nome != 0) return nome;
        if (anoDeCriacao != 0) return anoDeCriacao;
        return l1.ide.compareToIgnoreCase(l2.ide);
    }
}
