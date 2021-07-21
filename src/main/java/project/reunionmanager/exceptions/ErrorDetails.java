package project.reunionmanager.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Getter
public class ErrorDetails {
    private Date data;
    private String message;
    private String details;
}
