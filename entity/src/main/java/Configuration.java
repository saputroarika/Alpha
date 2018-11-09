import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Configuration implements Serializable {
    private static final long serialVersionUID = -5745367322749155296L;
    private String ipAddress;
    private String serviceName;
    private String SSHUser;
    private String SSHPassword;
    private String serviceUrl;
    private String shShutdown;
    private String shStartup;
}
