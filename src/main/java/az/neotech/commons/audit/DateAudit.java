package az.neotech.commons.audit;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@MappedSuperclass
public class DateAudit {

    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;
}
