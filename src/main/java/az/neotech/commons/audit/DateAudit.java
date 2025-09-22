package az.neotech.commons.audit;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DateAudit {

    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;
}
