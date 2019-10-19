package test.demo1.config;

import org.hibernate.validator.constraints.Length;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ConfigurationProperties("accounts.smtp")
@Validated()
public class MailProperties {

    @Max(9095)
    @Min(9090)
    private int port;

    @NotEmpty()
    private String hostname;

    @Length(min = 5, max = 25, message = "El rango esta afuera")
    private String from;


    private List<String> cc;

    private Map<String, String> header;

    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public List<String> getCc() {
        return cc;
    }

    public void setCc(List<String> cc) {
        this.cc = cc;
    }


    public CredentialProperties getCredentials() {
        return credentials;
    }

    public void setCredentials(CredentialProperties credentials) {
        this.credentials = credentials;
    }

    @NotNull()
    private CredentialProperties credentials;

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


    static public class CredentialProperties{

        @NotEmpty()
        private String username;
        @NotEmpty()
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }
}


