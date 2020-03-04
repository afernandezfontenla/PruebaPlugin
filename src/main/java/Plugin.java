import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;
import javax.swing.*;
import java.io.IOException;


public class Plugin {
    public static void main(String[] args) throws IOException {

        String token = JOptionPane.showInputDialog("Introduce el token:");
        //String usuario = JOptionPane.showInputDialog("Escribe tu usuario de Github: ");
        //String password = JOptionPane.showInputDialog("Escribe tu contraseña de Github: ");
        String nombre = JOptionPane.showInputDialog("Escribe nombre del repositorio: ");
        String descrip = JOptionPane.showInputDialog("Escribe una descripción del respositorio: ");

        GitHub github = new GitHubBuilder().withJwtToken(token).build();
        GHRepository repo = github.createRepository(nombre, descrip, "https://github.com/afernandezfontenla", false/*public*/);
    }
}