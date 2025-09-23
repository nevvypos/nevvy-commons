package az.neotech.commons.audit;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class DetailedAudit {
    protected String createdBy;
    protected String modifiedBy;
    protected LocalDateTime createdAt;
    protected LocalDateTime modifiedAt;
}
