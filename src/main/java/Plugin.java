import org.kohsuke.github.GHCreateRepositoryBuilder;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import java.io.IOException;
import java.util.Scanner;

public class Plugin{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String usuario,contraseña;
        System.out.println("Introduce un usuario");

        usuario = sc.nextLine();
        System.out.println("Introduce una contraseña");
        contraseña = sc.nextLine();

        GitHub gh = GitHub.connectUsingPassword(usuario, contraseña);
        GHCreateRepositoryBuilder CrearRepo = gh.createRepository("PruebaGitHubApi").description("Prueba API").private_(true);
        GHRepository new_repo = CrearRepo.create();
    }
}

