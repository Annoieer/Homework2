package homework_2.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EmployeePositionEnum {
    ENGINEER("Engineer"),
    DIRECTOR("Director"),
    REPORTER("Reporter"),
    MECHANIC("Mechanic");

    private final String position;
}
