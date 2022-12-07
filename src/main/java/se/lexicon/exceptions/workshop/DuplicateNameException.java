package se.lexicon.exceptions.workshop;

public class DuplicateNameException extends Exception {
    private String paramValue;
    private String message;
    private Integer errorCode;

    public DuplicateNameException(String message, String paramValue)
    {
        super(message);
        this.message = message;
        this.paramValue = paramValue;
    }

    public DuplicateNameException(String message, Integer errorCode, String paramValue) {
        this(message, paramValue);
        this.errorCode = errorCode;
    }

    // getter methods if needed

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getParamValue() {
        return paramValue;
    }
}
