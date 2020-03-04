import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import javax.swing.*;
import java.io.IOException;


public class Plugin {
    public static void main(String[] args) throws IOException {

        //Pido el nombre del repositorio a crear
        String nombre = JOptionPane.showInputDialog("Escribe nombre del repositorio: ");
        //Pido la descripción del repositorio
        String descrip = JOptionPane.showInputDialog("Escribe una descripción del respositorio: ");

        GitHub github = GitHubBuilder.fromPropertyFile("/home/local/DANIELCASTELAO/afernandezfontenla/IdeaProjects/EjPlugin/.github").build();
        GHRepository repo = github.createRepository(nombre,descrip,"https://www.google.com/",false);
    }

}