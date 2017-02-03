package br.com.ufcg.model;

/**
 * Created by manoelferreira on 2/2/17.
 */
public class Contato {

    private long id;
    private String name;
    private String email;
    private String gitHub;

    public Contato(String name, String email, String gitHub) {
        this.name = name;
        this.email = email;
        this.gitHub = gitHub;
    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGitHub() {
        return gitHub;
    }
}
