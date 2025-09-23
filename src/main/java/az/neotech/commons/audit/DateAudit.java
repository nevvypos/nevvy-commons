package az.neotech.commons.audit;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class DateAudit {

    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;
}
