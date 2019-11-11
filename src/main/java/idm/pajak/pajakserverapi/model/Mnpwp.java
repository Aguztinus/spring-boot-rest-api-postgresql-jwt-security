package idm.pajak.pajakserverapi.model;

import idm.pajak.pajakserverapi.model.audit.UserDateAudit;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Mnpwp")
@Data
@NoArgsConstructor
public class Mnpwp extends UserDateAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 15, nullable = false)
    @NotBlank
    @Size(min = 3, max = 15)
    private String npwp;

    @NotBlank
    @Size(max = 90)
    private String name;

    @Size(max = 770)
    private String alamat;
}
